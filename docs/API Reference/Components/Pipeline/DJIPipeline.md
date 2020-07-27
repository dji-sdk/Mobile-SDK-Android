<div class="article"><h1 ><font color="#AAA">class </font>Pipeline</h1></div>

~~~java
 interface Pipeline 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Establishes a pipeline connected with Onboard device or Payload device to transmit data. Uses <code><a href="/Components/Pipeline/DJIPipelines.html#djipipelines_connect">connect</a></code>  to create a pipeline. <code><a href="/Components/Pipeline/DJIPipelines.html#djipipelines_disconnect">disconnect</a></code> can be invoked to destroy the data transmission channel and disconnect from the Onboard device or Payload device.



##### Class Members:

<div class="api-row" id="djipipeline_id"><div class="api-col left">ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipipeline_id_inline">getId</a></div></div><div class="inline-doc" id="djipipeline_id_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getId</h6></div>

~~~java
    int getId()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">The identification number of the pipeline connected with the Payload or the Onboard device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of pipeline id.</i></td></tr></table></html></div>

<div class="api-row" id="djipipeline_transmissiontype"><div class="api-col left">Transmission Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipipeline_transmissiontype_inline">getType</a></div></div><div class="inline-doc" id="djipipeline_transmissiontype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getType</h6></div>

~~~java
    TransmissionControlType getType()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Transmission processing type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Pipeline/DJIPipeline.html#djipipeline_djitransmissioncontroltype">TransmissionControlType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Pipeline/DJIPipeline.html#djipipeline_djitransmissioncontroltype">TransmissionControlType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipipeline_devicetype"><div class="api-col left">Device Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipipeline_devicetype_inline">getDeviceType</a></div></div><div class="inline-doc" id="djipipeline_devicetype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDeviceType</h6></div>

~~~java
    PipelineDeviceType getDeviceType()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Device type connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Pipeline/DJIPipeline.html#djipipeline_djipipelinedevicetype">PipelineDeviceType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Pipeline/DJIPipeline.html#djipipeline_djipipelinedevicetype">PipelineDeviceType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipipeline_writedata"><div class="api-col left">Write Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipipeline_writedata_inline">writeData</a></div></div><div class="inline-doc" id="djipipeline_writedata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>writeData</h6></div>

~~~java
    int writeData(byte[] data, int offset, int length)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Data to be sent. 1 KB data size is recommended.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">data</td><td><font color="#666"><i>The data needs to be sent.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">offset</td><td><font color="#666"><i>The start offset in the data.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">length</td><td><font color="#666"><i>The number of bytes to write.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>If the return code greater than 0 it is the length of data written otherwise it is the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djipipeline_readdata"><div class="api-col left">Read Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipipeline_readdata_inline">readData</a></div></div><div class="inline-doc" id="djipipeline_readdata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>readData</h6></div>

~~~java
    int readData(byte[] buff, int offset, int length)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Read data from the pipeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">buff</td><td><font color="#666"><i>The buffer into which the data is read.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">offset</td><td><font color="#666"><i>The start offset in the array buff at which the data is written.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">length</td><td><font color="#666"><i>The maximum number of bytes to read.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>If the return code greater than 0 it is the length of data read otherwise it is the error code.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djipipeline_djitransmissioncontroltype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipipeline_djitransmissioncontroltype_inline">TransmissionControlType</a></div></div><div class="inline-doc" id="djipipeline_djitransmissioncontroltype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>TransmissionControlType</h6></div>

~~~java
 enum TransmissionControlType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">Defines pipeline transmission control type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipipeline_djitransmissioncontroltype_stable_inline"></a>STABLE</td><td><font color="#666">Guarantees delivery of data and that packets will be delivered in the order they were sent.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipipeline_djitransmissioncontroltype_unreliable_inline"></a>PUSH</td><td><font color="#666">This transmission control type does not provide guaranteed delivery and a datagram packet may become corrupt or lost in transit.  Suitable for time-sensitive transmission.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djipipeline_djipipelinedevicetype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipipeline_djipipelinedevicetype_inline">PipelineDeviceType</a></div></div><div class="inline-doc" id="djipipeline_djipipelinedevicetype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PipelineDeviceType</h6></div>

~~~java
 enum PipelineDeviceType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.mop.common</td></tr></table></html>



##### Description:



<font color="#666">The enum is used to represent the pipeline device type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipipeline_djipipelinedevicetype_onboard_inline"></a>ON_BOARD</td><td><font color="#666">Onboard device. Please check the developer website: https://developer.dji.com/onboard-sdk/.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipipeline_djipipelinedevicetype_payload_inline"></a>PAYLOAD</td><td><font color="#666">Payload device. Please check the developer website: https://developer.dji.com/payload-sdk/.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipipeline_djipipelinedevicetype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djipipelines"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Pipeline/DJIPipelines.html">Pipelines</a></div></div>
