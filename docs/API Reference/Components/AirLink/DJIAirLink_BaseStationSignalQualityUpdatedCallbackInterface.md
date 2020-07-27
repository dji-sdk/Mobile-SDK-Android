<div class="article"><h1 ><font color="#AAA">class </font>BaseStationSignalQualityUpdatedCallback</h1></div>

~~~java
 interface BaseStationSignalQualityUpdatedCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Callback for updated signal quality in percent for the base station (from remote controller  to the base station). This link transfers all information between the remote controller and  the base station, which is predominantly positioning information.



##### Class Members:

<div class="api-row" id="djiairlink_basestationsignalqualityupdatedcallbackinterface_onbasestationsignalqualityupdated"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_basestationsignalqualityupdatedcallbackinterface_onbasestationsignalqualityupdated_inline">onBaseStationSignalQualityUpdated</a></div></div><div class="inline-doc" id="djiairlink_basestationsignalqualityupdatedcallbackinterface_onbasestationsignalqualityupdated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onBaseStationSignalQualityUpdated</h6></div>

~~~java
        void onBaseStationSignalQualityUpdated(int quality)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Invokes when base station signal quality changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">quality</td><td><font color="#666"><i>An int value of the signal quality.</i></td></tr></table></html></div>


