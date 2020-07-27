<div class="article"><h1 ><font color="#AAA">class </font>RTKConnectionStateWithBaseStationReferenceSourceCallback</h1></div>

~~~java
 interface RTKConnectionStateWithBaseStationReferenceSourceCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback interface that updates RTK connection state and connected base station information.



##### Class Members:



#### Callback Method

<div class="api-row" id="djirtk_rtkconnectionstatewithbasestationreferencesourcecallbackinterface_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_rtkconnectionstatewithbasestationreferencesourcecallbackinterface_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djirtk_rtkconnectionstatewithbasestationreferencesourcecallbackinterface_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull RTKConnectionStateWithBaseStationReferenceSource connectionState, @Nullable RTKBaseStationInformation information)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Updates RTK connection state and connected base station information. Aircraft will try to connect to the base station  connected last time after it restarts. Stops to reconnect after 10 seconds. If current connection state  is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkconnectionstatewithbasestationreferencesource_aircraftrtkscanning">SCANNING</a></code> or <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkconnectionstatewithbasestationreferencesource_aircraftrtkidle">IDLE</a></code>,  this method still updates the base station information connected last time. Only can be used when current <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code>  is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_groundsystem">BASE_STATION</a></code>. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTK/DJIRTK.html#djirtk_djirtkconnectionstatewithbasestationreferencesource">RTKConnectionStateWithBaseStationReferenceSource</a> <font color="#000">connectionState</td><td><font color="#666"><i>RTK with base station connection state.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RTK/DJIRTK_DJIRTKBaseStationInformation.html#djirtk_djirtkbasestationinformation">RTKBaseStationInformation</a> <font color="#000">information</td><td><font color="#666"><i>Base station connection information.</i></td></tr></table></html></div>


