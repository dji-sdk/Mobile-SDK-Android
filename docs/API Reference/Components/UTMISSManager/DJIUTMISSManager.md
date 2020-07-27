<div class="article"><h1 ><font color="#AAA">class </font>UTMISSManager</h1></div>

~~~java
 class UTMISSManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">This class is to manage UTMISS flight data upload. According to the "Civil Aviation Administration of China's Light Civil UAV Flight Dynamic  Data Management Regulations ", relevant units, individuals that operate light, small civil drones and plant protection drones in the airspace  provided by the People's Republic of China with air traffic services need Timely, accurate and complete real-time reporting to the Civil Aviation  Administration to send real flight dynamic data. If flight dynamic data is not reported or missed in time, it shall be replaced in accordance with  relevant regulations on navigation flight control. According to the above requirements, this function will report user flight dynamics data to the  UTMISS server. Developers are requested to enable this function after obtaining user authorization.



##### Class Members:



#### State Updates

<div class="api-row" id="djiutmissmanager_setutmissflightdataupdateduploadstatuscallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_setutmissflightdataupdateduploadstatuscallback_inline">setUTMISSFlightDataUpdatedUploadStatusCallback</a></div></div><div class="inline-doc" id="djiutmissmanager_setutmissflightdataupdateduploadstatuscallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUTMISSFlightDataUpdatedUploadStatusCallback</h6></div>

~~~java
 void setUTMISSFlightDataUpdatedUploadStatusCallback(Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Called when the UTMISS (Unmanned Aircraft System Traffic Management Information Service System) flight data upload status has been updated.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Callback <font color="#000">callback</td><td><font color="#666"><i>The callback of <code><a href="/Components/UTMISSManager/DJIUTMISSManager_UTMISSFlightDataUpdatedUploadStatusCallbackInterface.html#djiutmissmanager_utmissflightdataupdateduploadstatuscallbackinterface">Callback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiutmissmanager_currentstatus"><div class="api-col left">Current Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_currentstatus_inline">getUploadStatus</a></div></div><div class="inline-doc" id="djiutmissmanager_currentstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUploadStatus</h6></div>

~~~java
 UTMISSFlightDataUploadStatus getUploadStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">The current UTMISS upload status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UTMISSManager/DJIUTMISSManager.html#djiutmissflightdatauploadstatus">UTMISSFlightDataUploadStatus</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/UTMISSManager/DJIUTMISSManager.html#djiutmissflightdatauploadstatus">UTMISSFlightDataUploadStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiutmissmanager_starttoupload"><div class="api-col left">Start Upload</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_starttoupload_inline">startToUpload</a></div></div><div class="inline-doc" id="djiutmissmanager_starttoupload_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startToUpload</h6></div>

~~~java
 synchronized DJIError startToUpload(UTMISSParam param) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Start UTMISS flight data upload.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UTMISSManager/DJIUTMISSManager_DJIUTMISSParam.html#djiutmissmanager_djiutmissparam">UTMISSParam</a> <font color="#000">param</td><td><font color="#666"><i>An object of <code><a href="/Components/UTMISSManager/DJIUTMISSManager_DJIUTMISSParam.html#djiutmissmanager_djiutmissparam">UTMISSParam</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">synchronized <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiutmissmanager_isstarted"><div class="api-col left">Check Upload Started</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_isstarted_inline">isStarted</a></div></div><div class="inline-doc" id="djiutmissmanager_isstarted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isStarted</h6></div>

~~~java
 boolean isStarted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Start UTMISS flight data upload.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the data upload is started.</i></td></tr></table></html></div>

<div class="api-row" id="djiutmissmanager_getutmisslogpath"><div class="api-col left">Get UTMISS Log Path</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_getutmisslogpath_inline">getUtmissLogPath</a></div></div><div class="inline-doc" id="djiutmissmanager_getutmisslogpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUtmissLogPath</h6></div>

~~~java
 String getUtmissLogPath() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">UTMISS Log save path.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String value.</i></td></tr></table></html></div>

<div class="api-row" id="djiutmissmanager_stoptoupload"><div class="api-col left">Stop Upload</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiutmissmanager_stoptoupload_inline">stopToUpload</a></div></div><div class="inline-doc" id="djiutmissmanager_stoptoupload_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopToUpload</h6></div>

~~~java
 synchronized void stopToUpload() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Stop UTMISS flight data upload.

</div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiutmissmanager_utmissflightdataupdateduploadstatuscallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/UTMISSManager/DJIUTMISSManager_UTMISSFlightDataUpdatedUploadStatusCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiutmissmanager_djiutmissparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/UTMISSManager/DJIUTMISSManager_DJIUTMISSParam.html">UTMISSParam</a></div></div><div class="api-row" id="djiutmissflightdatauploadstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiutmissflightdatauploadstatus_inline">UTMISSFlightDataUploadStatus</a></div></div><div class="inline-doc" id="djiutmissflightdatauploadstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UTMISSFlightDataUploadStatus</h6></div>

~~~java
 enum UTMISSFlightDataUploadStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">The UTMISS flight data upload status.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiutmissflightdatauploadstatus_idle_inline"></a>IDLE</td><td><font color="#666">The UTMISS flight data upload status is idle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiutmissflightdatauploadstatus_uploading_inline"></a>UPLOADING</td><td><font color="#666">The UTMISS flight data upload status is uploading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiutmissflightdatauploadstatus_caching_inline"></a>CACHING</td><td><font color="#666">The UTMISS flight data upload status is caching.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiutmissflightdatauploadstatus_outofdatastoragespace_inline"></a>OUT_OF_DATA_STORAGE_SPACE</td><td><font color="#666">Out of data storage space. No more data can be written.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiutmissflightdatauploadstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The UTMISS flight data upload status is unknown.</td></tr></table></html>

##### Class Members:

</div>


