<div class="article"><h1 ><font color="#AAA">class </font>RTK</h1></div>

~~~java
 class RTK implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Real Time Kinematic



##### Class Members:



##### Related:

<div class="api-row" id="djirtk_djirtkbasestationinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_DJIRTKBaseStationInformation.html">RTKBaseStationInformation</a></div></div><div class="api-row" id="djirtk_djirtkconnectionstatewithbasestationreferencesource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_inline">RTKConnectionStateWithBaseStationReferenceSource</a></div></div><div class="inline-doc" id="djirtk_djirtkconnectionstatewithbasestationreferencesource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RTKConnectionStateWithBaseStationReferenceSource</h6></div>

~~~java
 enum RTKConnectionStateWithBaseStationReferenceSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">All the possible connection state of DJIRTKConnectionStateWithBaseStationReferenceSource  when <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code>  is  <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_groundsystem">BASE_STATION</a></code>.  It is only supported by Matrice 300 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_aircraftrtkidle_inline"></a>IDLE</td><td><font color="#666">Aircraft RTK is in idle state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_aircraftrtkscanning_inline"></a>SCANNING</td><td><font color="#666">Aircraft is scanning all base stations that are possible to be connected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_basestationconnecting_inline"></a>CONNECTING</td><td><font color="#666">The aircraft is connecting with the base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_basestationconnected_inline"></a>CONNECTED</td><td><font color="#666">The aircraft is connected with the base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_basestationdisconnected_inline"></a>DISCONNECTED</td><td><font color="#666">The aircraft is disconnected from the base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkconnectionstatewithbasestationreferencesource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown base station location connection state.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_rtkbasestationlistcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_RTKBaseStationListCallbackInterface.html">RTKBaseStationListCallback</a></div></div><div class="api-row" id="djirtk_rtkconnectionstatewithbasestationreferencesourcecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_RTKConnectionStateWithBaseStationReferenceSourceCallbackInterface.html">RTKConnectionStateWithBaseStationReferenceSourceCallback</a></div></div><div class="api-row" id="djirtk_djirtkstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_DJIRTKState.html">RTKState</a></div></div><div class="api-row" id="djirtk_djirtkdatasource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkdatasource_inline">DataSource</a></div></div><div class="inline-doc" id="djirtk_djirtkdatasource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DataSource</h6></div>

~~~java
 enum DataSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">This enum defines the data source (either GPS or RTK) of a recorded location, e.g. home point. Only support by Phantom 4 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkdatasource_gps_inline"></a>GPS</td><td><font color="#666">The location coordinate is from GPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkdatasource_rtk_inline"></a>RTK</td><td><font color="#666">The location coordinate is from RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkdatasource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Data source is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtknetworkserviceprovider"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html">RTKNetworkServiceProvider</a></div></div><div class="api-row" id="djirtk_djirtknetworkservicecoordinatesystem"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtknetworkservicecoordinatesystem_inline">CoordinateSystem</a></div></div><div class="inline-doc" id="djirtk_djirtknetworkservicecoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CoordinateSystem</h6></div>

~~~java
 enum CoordinateSystem 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Coordinate System for Network RTK. It is supported by Phantom 4 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkservicecoordinatesystem_wgs84_inline"></a>WGS84</td><td><font color="#666">The coordinate system is World Geodetic System 1984.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkservicecoordinatesystem_cgcs2000_inline"></a>CGCS2000</td><td><font color="#666">The coordinate system is China Geodetic Coordinate System 2000.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkservicecoordinatesystem_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The coordinate system is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_djirtknetworkserviceaccountstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtknetworkserviceaccountstate_inline">NetworkServiceAccountState</a></div></div><div class="inline-doc" id="djirtk_djirtknetworkserviceaccountstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>NetworkServiceAccountState</h6></div>

~~~java
 enum NetworkServiceAccountState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkservicecoordinatesystem">CoordinateSystem</a></code>. It is supported by Phantom 4 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceaccountstate_notpurchased_inline"></a>NOT_PURCHASED</td><td><font color="#666">Network RTK service is not purchased.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceaccountstate_unbound_inline"></a>UNBOUND</td><td><font color="#666">Device is not bound.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceaccountstate_bound_inline"></a>BOUND</td><td><font color="#666">Device is bound.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceaccountstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Network RTK service account state is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_djirtknetworkserviceplantype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtknetworkserviceplantype_inline">NetworkServicePlanType</a></div></div><div class="inline-doc" id="djirtk_djirtknetworkserviceplantype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>NetworkServicePlanType</h6></div>

~~~java
 enum NetworkServicePlanType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Network RTK service plan type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplantype_a_inline"></a>A</td><td><font color="#666">Plan type A.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplantype_b_inline"></a>B</td><td><font color="#666">Plan type B.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplantype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown Plan type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_djirtknetworkserviceplanstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtknetworkserviceplanstate_inline">NetworkServicePlanState</a></div></div><div class="inline-doc" id="djirtk_djirtknetworkserviceplanstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>NetworkServicePlanState</h6></div>

~~~java
 enum NetworkServicePlanState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Network RTK Service Plan's State.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplanstate_unactivated_inline"></a>UNACTIVATED</td><td><font color="#666">The plan has not activated.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplanstate_activated_inline"></a>ACTIVATED</td><td><font color="#666">The plan has activated.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplanstate_expired_inline"></a>EXPIRED</td><td><font color="#666">The plan has Expired.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtknetworkserviceplanstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The plan state is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_djirtkreferencestationsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkreferencestationsource_inline">ReferenceStationSource</a></div></div><div class="inline-doc" id="djirtk_djirtkreferencestationsource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ReferenceStationSource</h6></div>

~~~java
 enum ReferenceStationSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkreferencestationsource_none_inline"></a>NONE</td><td><font color="#666">Not using any reference station source.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkreferencestationsource_groundsystem_inline"></a>BASE_STATION</td><td><font color="#666">RTK is using the D-RTK 2 base station as the reference station. It is supported by Phantom 4 RTK, P4 Multispectral and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkreferencestationsource_networkservice_inline"></a>CUSTOM_NETWORK_SERVICE</td><td><font color="#666">RTK is using third-party network service as the reference station. The network service should use  NTRIP(Networked Transport of RTCM via  Internet Protocol). It is supported by Phantom 4 RTK, P4 Multispectral, Matrice 210 RTK V2 and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkreferencestationsource_networkrtk_inline"></a>NETWORK_RTK</td><td><font color="#666">Default virtual reference station solution to provide cm level accurate position.  The frame can be either WGS84 or CGCS 2000. Please note that this default solution can only be used  in China. Please add the "djinetworkrtkhelper" to the project via gradle: <br> implementation 'com.dji:library-networkrtk-helper:2.0.0'. It is only supported  by Phantom 4 RTK, P4 Multispectral and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkreferencestationsource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown reference station source.</td></tr></table></html>

##### Class Members:



##### Related:

<div class="api-row" id="djirtk_djirtkreferencestationsource_callback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_DJIRTKReferenceStationSource_Callback.html">Callback</a></div></div></div>

<div class="api-row" id="djirtk_djirtkheadingsolution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkheadingsolution_inline">HeadingSolution</a></div></div><div class="inline-doc" id="djirtk_djirtkheadingsolution_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>HeadingSolution</h6></div>

~~~java
@EXClassNullAway
 enum HeadingSolution 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This enum defines the Heading solution currently being used. The  heading solution describes the method used to determine heading. And  Indicates the accuracy of the <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkstate_heading">getHeading</a></code>. It is  supported by Phantom 4 RTK and Matrice 200 Series V2.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkheadingsolution_none_inline"></a>NONE</td><td><font color="#666">No heading solution. This can be caused by an insufficient number of  satellites in view, insufficient time to lock onto the satellites, or a  loss in communication link between the mobile station and base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkheadingsolution_singlepoint_inline"></a>SINGLE_POINT</td><td><font color="#666">RTK point Heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkheadingsolution_float_inline"></a>FLOAT</td><td><font color="#666">Float solution Heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkheadingsolution_fixedpoint_inline"></a>FIXED_POINT</td><td><font color="#666">Fixed-point solution direction (most accurate).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkheadingsolution_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtk_djirtkreceiverinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html">ReceiverInfo</a></div></div><div class="api-row" id="djirtk_djilocationstandarddeviation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_DJILocationStandardDeviation.html">LocationStandardDeviation</a></div></div><div class="api-row" id="djirtk_setupdatertkstatecallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_setupdatertkstatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djirtk_setupdatertkstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable RTKState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set RTK state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkstate">RTKState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_addreferencestationsourcecallback"><div class="api-col left">Add Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_addreferencestationsourcecallback_inline">addReferenceStationSourceCallback</a></div></div><div class="inline-doc" id="djirtk_addreferencestationsourcecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addReferenceStationSourceCallback</h6></div>

~~~java
 void addReferenceStationSourceCallback(@NonNull ReferenceStationSource.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to receive the reference station source.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive reference station source.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_removereferencestationsourcecallback"><div class="api-col left">Remove Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_removereferencestationsourcecallback_inline">removeReferenceStationSourceCallback</a></div></div><div class="inline-doc" id="djirtk_removereferencestationsourcecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeReferenceStationSourceCallback</h6></div>

~~~java
 void removeReferenceStationSourceCallback(@NonNull ReferenceStationSource.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Removes a listener that receives the reference station source.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive reference station source.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_setrtkbasestationlistcallback"><div class="api-col left">Set Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_setrtkbasestationlistcallback_inline">setRtkBaseStationListCallback</a></div></div><div class="inline-doc" id="djirtk_setrtkbasestationlistcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRtkBaseStationListCallback</h6></div>

~~~java
 void setRtkBaseStationListCallback(@Nullable RTKBaseStationListCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets RTK base station scanned information update rtkBaseStationListCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RTK/DJIRTK_RTKBaseStationListCallbackInterface.html#djirtk_rtkbasestationlistcallbackinterface">RTKBaseStationListCallback</a> <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the information of rtk base station scanned.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_setrtkconnectionstatewithbasestationcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_setrtkconnectionstatewithbasestationcallback_inline">setRtkConnectionStateWithBaseStationCallback</a></div></div><div class="inline-doc" id="djirtk_setrtkconnectionstatewithbasestationcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRtkConnectionStateWithBaseStationCallback</h6></div>

~~~java
 void setRtkConnectionStateWithBaseStationCallback(RTKConnectionStateWithBaseStationReferenceSourceCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set RTK base station connection state and information update rtkBaseStationConnectionInformationCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_RTKConnectionStateWithBaseStationReferenceSourceCallbackInterface.html#djirtk_rtkconnectionstatewithbasestationreferencesourcecallbackinterface">RTKConnectionStateWithBaseStationReferenceSourceCallback</a> <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the information of the connection between RTK and base station.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_setrtkenabled"><div class="api-col left">RTK Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_setrtkenabled_inline">setRtkEnabled</a></div></div><div class="inline-doc" id="djirtk_setrtkenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRtkEnabled</h6></div>

~~~java
 void setRtkEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_rtk_enabled_key">FlightControllerKey.RTK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables RTK positioning. Disable RTK when in poor signal environments, where incorrect positioning information might make controlling the aircraft difficult. Can only be set when the motors are off.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable RTK positioning.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_isconnected"><div class="api-col left">Is Connected</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_isconnected_inline">isConnected</a></div></div><div class="inline-doc" id="djirtk_isconnected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if RTK is connected to the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_getrtkenabled"><div class="api-col left">Get RTK Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_getrtkenabled_inline">getRtkEnabled</a></div></div><div class="inline-doc" id="djirtk_getrtkenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRtkEnabled</h6></div>

~~~java
 void getRtkEnabled(@NonNull final CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if RTK is enabled. Phantom 4 RTK has different behavior from the  other products that supports RTK: <br> - For aircrafts except Phantom 4 RTK,  disabling RTK will stop RTK from pushing valid position. <br> - For Phantom  4 RTK, RTK will continue to push latest RTK coordinate if there is strong  satellite signal after disabling RTK. However, the flight controller will  not use the RTK coordinate for navigation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_setreferencestationsource"><div class="api-col left">Set Reference Station Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_setreferencestationsource_inline">setReferenceStationSource</a></div></div><div class="inline-doc" id="djirtk_setreferencestationsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setReferenceStationSource</h6></div>

~~~java
 void setReferenceStationSource(@NonNull final ReferenceStationSource source, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the reference station source that provides real-time corrections for the  RTK air system. It is only supported by Phantom 4 RTK. For Matrice 210 RTK and  Matrice 600 series, the reference station is always the physical base station.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a> <font color="#000">source</td><td><font color="#666"><i>Reference station source to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_startsearchbasestation"><div class="api-col left">Start Search Base Station</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_startsearchbasestation_inline">startSearchBaseStation</a></div></div><div class="inline-doc" id="djirtk_startsearchbasestation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startSearchBaseStation</h6></div>

~~~java
 void startSearchBaseStation(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Used to start searching for DJI base station that can be controlled with the Mobile  SDK.  Searching  will automatically stop after a base station is connected. Only can be used when  current <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code> is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_groundsystem">BASE_STATION</a></code>.  It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_stopsearchbasestation"><div class="api-col left">Stop Search Base Station</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_stopsearchbasestation_inline">stopSearchBaseStation</a></div></div><div class="inline-doc" id="djirtk_stopsearchbasestation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopSearchBaseStation</h6></div>

~~~java
 void stopSearchBaseStation(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Used to stop searching for DJI base station that can be controlled with the Mobile SDK.  If searching is stopped without selecting a base station, the last connected base station will be reconnected.  Only can be used when current  <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code>  is  <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_groundsystem">BASE_STATION</a></code>. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_connecttobasestation"><div class="api-col left">Connect To Base Station</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_connecttobasestation_inline">connectToBaseStation</a></div></div><div class="inline-doc" id="djirtk_connecttobasestation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>connectToBaseStation</h6></div>

~~~java
 void connectToBaseStation(long baseStationID, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Choose a base station to connect by base station's ID. Only can be used when current <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code>  is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_groundsystem">BASE_STATION</a></code>. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">baseStationID</td><td><font color="#666"><i>The base station's ID that chosen to be connected.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>


