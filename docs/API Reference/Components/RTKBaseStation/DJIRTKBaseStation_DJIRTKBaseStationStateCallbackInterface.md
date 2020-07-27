<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Callback Interface for RTK Base Station State.



##### Class Members:



#### Callback Method

<div class="api-row" id="djirtkbasestation_djirtkbasestationstate_onupdatebasestationstate"><div class="api-col left">Base Station State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationstate_onupdatebasestationstate_inline">onUpdateBaseStationState</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationstate_onupdatebasestationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdateBaseStationState</h6></div>

~~~java
        void onUpdateBaseStationState(BaseStationState baseStationState)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the RTK base station state. Only Supported  by Phantom 4 RTK and M200 series V2. This is only available on D-RTK 2 with  firmware version v01.00.0300 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationState.html#djirtkbasestation_djirtkbasestationstate">BaseStationState</a> <font color="#000">baseStationState</td><td><font color="#666"><i>Base Station State.</i></td></tr></table></html></div>


