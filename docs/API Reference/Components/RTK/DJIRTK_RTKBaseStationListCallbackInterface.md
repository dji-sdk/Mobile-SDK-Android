<div class="article"><h1 ><font color="#AAA">class </font>RTKBaseStationListCallback</h1></div>

~~~java
 interface RTKBaseStationListCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback interface that updates the array of the RTK base station scanned information. If you  call <code><a href="/Components/RTK/DJIRTK.html#djirtk_startsearchbasestation">startSearchBaseStation</a></code>, each Base station while push it's information once. If  you call <code><a href="/Components/RTK/DJIRTK.html#djirtk_stopsearchbasestation">stopSearchBaseStation</a></code>, this callback function will stop updates.



##### Class Members:



#### Callback Method

<div class="api-row" id="djirtk_rtkbasestationlistcallbackinterface_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_rtkbasestationlistcallbackinterface_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djirtk_rtkbasestationlistcallbackinterface_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(RTKBaseStationInformation[] baseStationInformations)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Provides the list of DJI base station that can be connected with. Callback will continue to receive an updated list  after <code><a href="/Components/RTK/DJIRTK.html#djirtk_startsearchbasestation">startSearchBaseStation</a></code> is called. Invoke <code><a href="/Components/RTK/DJIRTK.html#djirtk_stopsearchbasestation">stopSearchBaseStation</a></code> to stop searching.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKBaseStationInformation.html#djirtk_djirtkbasestationinformation">RTKBaseStationInformation</a>[] <font color="#000">baseStationInformations</td><td><font color="#666"><i>An array contains Base station scan information.</i></td></tr></table></html></div>


