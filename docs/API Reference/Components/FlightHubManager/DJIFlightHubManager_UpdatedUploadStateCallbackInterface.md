<div class="article"><h1 ><font color="#AAA">class </font>UpdatedUploadStateCallback</h1></div>

~~~java
 interface UpdatedUploadStateCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Updates current state of uploading flight data. In order to  begin updates, call the <code><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html#djiflighthubmanager_flighthubmanagerdidupdateuploadstate">onUpdate</a></code>  addUpdatedUploadStateCallback} method.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiflighthubmanager_flighthubmanagerdidupdateuploadstate"><div class="api-col left">Upload State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_flighthubmanagerdidupdateuploadstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiflighthubmanager_flighthubmanagerdidupdateuploadstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull UploadState uploadState, @Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Updates states for the uploading progress of flight data.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubuploadstate">UploadState</a> <font color="#000">uploadState</td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubuploadstate">UploadState</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Error when uploading data failed.</i></td></tr></table></html></div>


