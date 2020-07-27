<div class="article"><h1 ><font color="#AAA">class </font>TransmissionListener</h1></div>

~~~java
 interface TransmissionListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">The listener will be notified when the transmission for the audio file starts.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onstart"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onstart_inline">onStart</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStart</h6></div>

~~~java
    void onStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Called when the transmission starts and the aircraft is ready to receive data of  the audio file from the mobile device.

</div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onprogress_inline">onProgress</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProgress</h6></div>

~~~java
    void onProgress(int dataSize)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Called to update the transmission progress. The progress is updated when a chunk  of data is received successfully by the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">dataSize</td><td><font color="#666"><i>The accumulated data size of the audio file received by the aircraft.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfinish_inline">onFinish</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFinish</h6></div>

~~~java
    void onFinish(int index)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Called when the transmission finishes successfully.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index assigned by the aircraft for the new audio file.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfailure_inline">onFailure</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface_onfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFailure</h6></div>

~~~java
    void onFailure(DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Called when the transmission is interrupted by an error.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The possible error during the transmission.</i></td></tr></table></html></div>


