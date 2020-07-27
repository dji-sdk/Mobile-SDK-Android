<div class="article"><h1 ><font color="#AAA">class </font>ChannelInterferenceCallback</h1></div>

~~~java
 interface ChannelInterferenceCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated power for interference signals with frequencies in the 2.4 GHz (2400MHz to 2482 MHz) frequency band incident  on the remote controller. Note, measuring the interference reduces effective data rate as the radio is spending time  listening to frequencies outside of the communication channel. Interference measurements will only be made if  the <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_setfrequencyinterferenceupdatedcallback">setChannelInterferenceCallback</a></code> property in OcuSyncLink is assigned to a method that  implements this callback.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiocusynclink_didupdatedownlinkinterference"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_didupdatedownlinkinterference_inline">onUpdate</a></div></div><div class="inline-doc" id="djiocusynclink_didupdatedownlinkinterference_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(FrequencyInterference[] rssis)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated power for interference signals with frequencies in the 2.4 GHz (2400MHz to 2482 MHz) frequency band  incident on the remote controller. Note, measuring the interference reduces effective data rate as the radio  is spending time listening to frequencies outside of the communication channel. 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncFrequencyInterference.html#djiocusynclink_djiocusyncfrequencyinterference">FrequencyInterference</a>[] <font color="#000">rssis</td><td><font color="#666"><i>The updated interference information. The elements in the array  of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncFrequencyInterference.html#djiocusynclink_djiocusyncfrequencyinterference">FrequencyInterference</a></code> objects each hold interference information about a small  part of the frequency band. Elements are sorted by increasing frequency.</i></td></tr></table></html></div>


