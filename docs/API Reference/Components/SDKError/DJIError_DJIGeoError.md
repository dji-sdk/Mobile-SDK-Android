<div class="article"><h1 ><font color="#AAA">class </font>DJIFlySafeError</h1></div>

~~~java
@EXClassNullAway
 class DJIFlySafeError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class contains the error type for GEO feature.



##### Class Members:

<div class="api-row" id="djierror_djigeoerror_getdjierror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_getdjierror_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djigeoerror_getdjierror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(Ccode ccode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in DJIGeoError according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Ccode <font color="#000">ccode</td><td><font color="#666"><i>Error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The DJIError object.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djierror_djigeoerror_could_not_connect_to_internet_for_pulling_data"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_could_not_connect_to_internet_for_pulling_data_inline">COULD_NOT_CONNECT_TO_INTERNET_FOR_PULLING_DATA</a></div></div><div class="inline-doc" id="djierror_djigeoerror_could_not_connect_to_internet_for_pulling_data_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COULD_NOT_CONNECT_TO_INTERNET_FOR_PULLING_DATA</h6></div>

~~~java
 static final DJIFlySafeError COULD_NOT_CONNECT_TO_INTERNET_FOR_PULLING_DATA = new DJIFlySafeError("Could not connect to the Internet while SDK try to pull the latest cached data from server.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Could not connect to the Internet while SDK try to pull the latest cached data from server.

</div>

<div class="api-row" id="djierror_djigeoerror_could_not_find_unlocked_record_in_the_server"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_could_not_find_unlocked_record_in_the_server_inline">COULD_NOT_FIND_UNLOCKED_RECORD_IN_THE_SERVER</a></div></div><div class="inline-doc" id="djierror_djigeoerror_could_not_find_unlocked_record_in_the_server_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COULD_NOT_FIND_UNLOCKED_RECORD_IN_THE_SERVER</h6></div>

~~~java
 static final DJIFlySafeError COULD_NOT_FIND_UNLOCKED_RECORD_IN_THE_SERVER = new DJIFlySafeError("Could not find unlocked record in the server.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Could not find unlocked record in the server.

</div>

<div class="api-row" id="djierror_djigeoerror_unlocked_record_not_find_on_aircraft"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_unlocked_record_not_find_on_aircraft_inline">UNLOCKED_RECORD_NOT_FIND_ON_AIRCRAFT</a></div></div><div class="inline-doc" id="djierror_djigeoerror_unlocked_record_not_find_on_aircraft_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNLOCKED_RECORD_NOT_FIND_ON_AIRCRAFT</h6></div>

~~~java
 static final DJIFlySafeError UNLOCKED_RECORD_NOT_FIND_ON_AIRCRAFT = new DJIFlySafeError("Could not find unlocked record on the aircraft.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Could not find unlocked record on the aircraft.

</div>

<div class="api-row" id="djierror_djigeoerror_no_data_in_database"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_no_data_in_database_inline">NO_DATA_IN_DATABASE</a></div></div><div class="inline-doc" id="djierror_djigeoerror_no_data_in_database_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_DATA_IN_DATABASE</h6></div>

~~~java
 static final DJIFlySafeError NO_DATA_IN_DATABASE = new DJIFlySafeError("No data in database")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No data in database.

</div>

<div class="api-row" id="djierror_djigeoerror_account_not_log_in_or_not_authorized"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_account_not_log_in_or_not_authorized_inline">ACCOUNT_NOT_LOGGED_IN_OR_NOT_AUTHORIZED</a></div></div><div class="inline-doc" id="djierror_djigeoerror_account_not_log_in_or_not_authorized_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACCOUNT_NOT_LOGGED_IN_OR_NOT_AUTHORIZED</h6></div>

~~~java
 static final DJIFlySafeError
        ACCOUNT_NOT_LOGGED_IN_OR_NOT_AUTHORIZED = new DJIFlySafeError("No logged in account or account did not get authorization.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No logged in account or account did not get authorization.

</div>

<div class="api-row" id="djierror_djigeoerror_flight_controller_serial_number_is_not_ready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_flight_controller_serial_number_is_not_ready_inline">FLIGHT_CONTROLLER_SERIAL_NUMBER_IS_NOT_READY</a></div></div><div class="inline-doc" id="djierror_djigeoerror_flight_controller_serial_number_is_not_ready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLIGHT_CONTROLLER_SERIAL_NUMBER_IS_NOT_READY</h6></div>

~~~java
 static final DJIFlySafeError FLIGHT_CONTROLLER_SERIAL_NUMBER_IS_NOT_READY = new DJIFlySafeError("The flight controller SN is not ready, could not start to execute next step, please try again later.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The flight controller SN is not ready.

</div>

<div class="api-row" id="djierror_djigeoerror_could_not_enable_or_disable_geo_system_while_aircraft_is_in_the_sky"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djigeoerror_could_not_enable_or_disable_geo_system_while_aircraft_is_in_the_sky_inline">COULD_NOT_ENABLE_OR_DISABLE_GEO_SYSTEM_WHILE_AIRCRAFT_IS_IN_THE_SKY</a></div></div><div class="inline-doc" id="djierror_djigeoerror_could_not_enable_or_disable_geo_system_while_aircraft_is_in_the_sky_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COULD_NOT_ENABLE_OR_DISABLE_GEO_SYSTEM_WHILE_AIRCRAFT_IS_IN_THE_SKY</h6></div>

~~~java
 static final DJIFlySafeError COULD_NOT_ENABLE_OR_DISABLE_GEO_SYSTEM_WHILE_AIRCRAFT_IS_IN_THE_SKY = new DJIFlySafeError("Could not enable or disable the GEO system while the aircraft is flying.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Could not enable or disable the GEO system while the aircraft is flying.

</div>

<div class="api-row" id="djierror_djisdkgeoerror_notloggedin"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkgeoerror_notloggedin_inline">NOT_LOGGED_IN</a></div></div><div class="inline-doc" id="djierror_djisdkgeoerror_notloggedin_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_LOGGED_IN</h6></div>

~~~java
 static final DJIFlySafeError NOT_LOGGED_IN = new DJIFlySafeError("No logged in account.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No user account recorded.

</div>

<div class="api-row" id="djierror_djisdkgeoerror_invalidsimulatedlocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkgeoerror_invalidsimulatedlocation_inline">INVALID_SIMULATED_LOCATION</a></div></div><div class="inline-doc" id="djierror_djisdkgeoerror_invalidsimulatedlocation_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_SIMULATED_LOCATION</h6></div>

~~~java
 static final DJIFlySafeError INVALID_SIMULATED_LOCATION = new DJIFlySafeError("INVALID simulation location.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666"> The simulated aircraft location is not valid. During the simulation, a location is valid if it is within 50km of (37.460484, -122.115312).

</div>

<div class="api-row" id="djierror_djisdkgeoerror_usermismatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkgeoerror_usermismatch_inline">USER_MISMATCH</a></div></div><div class="inline-doc" id="djierror_djisdkgeoerror_usermismatch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>USER_MISMATCH</h6></div>

~~~java
 static final DJIFlySafeError USER_MISMATCH = new DJIFlySafeError("User mismatch.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">User mismatch.

</div>



##### Inherited Methods:

<div class="api-row" id="djierror_djisdkflighthuberrorforcode"><div class="api-col left">dji.common.error.DJIError</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflighthuberrorforcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djisdkflighthuberrorforcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in the <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code> according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>errorCode for <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An NSError object initialized with errorCode. If the errorCode was 0, returns nil.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_djiutmisserrorforcodewitherrorcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserrorforcodewitherrorcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiutmisserrorforcodewitherrorcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Get DJIUTMISSError.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>An int value of error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_getdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_getdescription_inline">getDescription</a></div></div><div class="inline-doc" id="djierror_getdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of the error code.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The description of the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_setdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_setdescription_inline">setDescription</a></div></div><div class="inline-doc" id="djierror_setdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDescription</h6></div>

~~~java
 void setDescription(String desc) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Sets the description for the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">desc</td><td><font color="#666"><i>Description string.</i></td></tr></table></html></div>


