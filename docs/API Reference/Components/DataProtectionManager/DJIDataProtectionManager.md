<div class="article"><h1 ><font color="#AAA">class </font>DataProtectionManager</h1></div>

~~~java
 class DataProtectionManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">Data Protection Manager. DJI SDK will send data to DJI servers in the background in order to complete  logics, including data related to user's information. Data Protection Manager can be used to authorize  DJI server to access the user-related data. SDK will NOT send the data to DJI server in the background  before the authorization. Internet requests triggered by the user manually are not managed by <code><a href="/Components/DataProtectionManager/DJIDataProtectionManager.html#djidataprotectionmanager">DataProtectionManager</a></code>.  Involved user-related data is listed in the documentation of the interfaces. The authorization is not persistent and each  authorization setting will be reset to the default value for each APP's life cycle. This class is accessible before  calling <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_registerapp">registerApp</a></code>. The UTMISSManager class needs to report flight dynamic data to the UTMISS server in  accordance with the policy requirements of the Civil Aviation Administration of China. It is not in this category of management.  For details, please refer to the UTMISSManager interface document.



##### Class Members:

<div class="api-row" id="djidataprotectionmanager_authorizeaccesstodjidevicehardwareinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidataprotectionmanager_authorizeaccesstodjidevicehardwareinfo_inline">authorizeAccessToDJIDeviceHardwareInfo</a></div></div><div class="inline-doc" id="djidataprotectionmanager_authorizeaccesstodjidevicehardwareinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>authorizeAccessToDJIDeviceHardwareInfo</h6></div>

~~~java
 @Nullable
    DJIError authorizeAccessToDJIDeviceHardwareInfo(boolean hardwareInfoAuthorized) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">Authorizes DJI server to access DJI device's hardware information (serial numbers of the aircraft and the remote  controller). The serial number will be sent to DJI server for two purposes: <br> - DJI SDK analytics: the hashed  serial number is used to distinguish statistics from different DJI devices. <br> - App Activation: the serial number  is used to request the app activation state from the server. When the user is located in China, the serial number is  still sent to DJI server for policy reason even it is not authorized by the user. DJI server is NOT authorized by  default. However, it is highly recommended to ask the user to authorize it, which can help DJI keep improving SDK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">hardwareInfoAuthorized</td><td><font color="#666"><i><code>true</code> to authorize DJI server to access the data.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable     <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The encountered error if there is any.</i></td></tr></table></html></div>

<div class="api-row" id="djidataprotectionmanager_isaccesstodjidevicehardwareinfoauthorized"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidataprotectionmanager_isaccesstodjidevicehardwareinfoauthorized_inline">isAccessToDJIDeviceHardwareInfoAuthorized</a></div></div><div class="inline-doc" id="djidataprotectionmanager_isaccesstodjidevicehardwareinfoauthorized_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAccessToDJIDeviceHardwareInfoAuthorized</h6></div>

~~~java
 boolean isAccessToDJIDeviceHardwareInfoAuthorized() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">Get the authorization of access to data of type DJI Hardware Information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if it is authorized.</i></td></tr></table></html></div>

<div class="api-row" id="djidataprotectionmanager_isaccesstoobfuscatedlocationauthorized"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidataprotectionmanager_isaccesstoobfuscatedlocationauthorized_inline">isAccessToObfuscatedLocationAuthorized</a></div></div><div class="inline-doc" id="djidataprotectionmanager_isaccesstoobfuscatedlocationauthorized_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAccessToObfuscatedLocationAuthorized</h6></div>

~~~java
 boolean isAccessToObfuscatedLocationAuthorized() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">Get the authorization of access to data of type Obfuscated Location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if it is authorized.</i></td></tr></table></html></div>

<div class="api-row" id="djidataprotectionmanager_getinstance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidataprotectionmanager_getinstance_inline">getInstance</a></div></div><div class="inline-doc" id="djidataprotectionmanager_getinstance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInstance</h6></div>

~~~java
 static DataProtectionManager getInstance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">Get the singleton instance of the class.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/DataProtectionManager/DJIDataProtectionManager.html#djidataprotectionmanager">DataProtectionManager</a></td><td><font color="#666"><i>An object of <code><a href="/Components/DataProtectionManager/DJIDataProtectionManager.html#djidataprotectionmanager">DataProtectionManager</a></code>.</i></td></tr></table></html></div>


