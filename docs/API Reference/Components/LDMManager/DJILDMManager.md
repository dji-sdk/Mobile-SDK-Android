<div class="article"><h1 ><font color="#AAA">class </font>LDMManager</h1></div>

~~~java
 class LDMManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Local Data Mode (LDM) manager. When Local Data Mode is enabled, the SDK's access to the internet is restricted. Only application registration (confirming the app key is valid) will be unrestricted. All other SDK services will be restricted. When the SDK's internet access is restricted, all SDK services that require an internet connection will not be available or able to update. For instance, the Fly Zone manager will not be able to update the fly zone data base, retrieve the latest TFRs (temporary flight restrictions) or unlock fly zones. LDM is therefore most appropriate for users that have very stringent data requirements, and are able to accommodate this restricted functionality.  When Local Data Mode is enabled,  the UTMISSManager will not report flight dynamic data to the UTMISS server.



##### Class Members:

<div class="api-row" id="djildmmanager_isldmsupported"><div class="api-col left">Check LDM Support</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_isldmsupported_inline">isLDMSupported</a></div></div><div class="inline-doc" id="djildmmanager_isldmsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLDMSupported</h6></div>

~~~java
 boolean isLDMSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if LDM is supported in the current context. The SDK locally uses GPS location and MCC (mobile country code) to determine the country  of operation. If LDM is not enabled and the internet is accessible, the IP address is also  used to determine the country of operation. The default value is <code>true</code> after the first installation.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A bool value to check if LDM is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_isldmenabled"><div class="api-col left">Check LDM Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_isldmenabled_inline">isLDMEnabled</a></div></div><div class="inline-doc" id="djildmmanager_isldmenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLDMEnabled</h6></div>

~~~java
 boolean isLDMEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if LDM is already enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if LDM is enabled.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_getldmsupported"><div class="api-col left">Get LDM Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_getldmsupported_inline">getLDMSupported</a></div></div><div class="inline-doc" id="djildmmanager_getldmsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLDMSupported</h6></div>

~~~java
 void getLDMSupported(CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if LDM is supported. The SDK will get whether your app supports LDM from the remote server.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_enableldm"><div class="api-col left">Enable LDM</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_enableldm_inline">enableLDM</a></div></div><div class="inline-doc" id="djildmmanager_enableldm_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enableLDM</h6></div>

~~~java
 @Nullable
    void enableLDM(CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Enables LDM. Can only be enabled if <code><a href="/Components/LDMManager/DJILDMManager.html#djildmmanager_isldmsupported">isLDMSupported</a></code> is <code>true</code>. Please call <code><a href="/Components/LDMManager/DJILDMManager.html#djildmmanager_getldmsupported">getLDMSupported</a></code> methods firstly.  Call this method before calling the other methods of SDK (including <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_registerapp">registerApp</a></code>) to restrict the internet access  of SDK (SDK registration is unrestricted).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable     void</td><td><font color="#666"><i>The error occurred. NULL if LDM is enabled successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_disableldm"><div class="api-col left">Disable LDM</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_disableldm_inline">disableLDM</a></div></div><div class="inline-doc" id="djildmmanager_disableldm_inline"

><div class="article"><h6 ><font color="#AAA">method </font>disableLDM</h6></div>

~~~java
 void disableLDM() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Disables LDM.

</div>



##### Related:

<div class="api-row" id="djildmmanager_setcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_setcallback_inline">setCallback</a></div></div><div class="inline-doc" id="djildmmanager_setcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCallback</h6></div>

~~~java
 void setCallback(LDMCallback ldmCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Sets the LDM callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LDMManager/DJILDMManager_LDMCallbackInterface.html#djildmmanager_ldmcallbackinterface">LDMCallback</a> <font color="#000">ldmCallback</td><td><font color="#666"><i>The execution callback with the returned value.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_ldmcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LDMManager/DJILDMManager_LDMCallbackInterface.html">LDMCallback</a></div></div>
