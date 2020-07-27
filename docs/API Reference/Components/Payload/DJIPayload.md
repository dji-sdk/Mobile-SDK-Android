<div class="article"><h1 ><font color="#AAA">class </font>Payload</h1></div>

~~~java
 class Payload extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">Class used to interact with the payload device mounted on DJI aircraft.



##### Class Members:

<div class="api-row" id="djipayload_pipelines"><div class="api-col left">Pipe Lines</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_pipelines_inline">getPipelines</a></div></div><div class="inline-doc" id="djipayload_pipelines_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPipelines</h6></div>

~~~java
 Pipelines getPipelines() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">The pipelines to transmit data between DJI Payload device and DJI mobile SDK. It's only supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Pipeline/DJIPipelines.html#djipipelines">Pipelines</a></td><td><font color="#666"><i>The <code><a href="/Components/Pipeline/DJIPipelines.html#djipipelines">Pipelines</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getupstreambandwidth"><div class="api-col left">Upstream Bandwidth</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getupstreambandwidth_inline">getUpstreamBandwidth</a></div></div><div class="inline-doc" id="djipayload_getupstreambandwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpstreamBandwidth</h6></div>

~~~java
 void getUpstreamBandwidth(final CommonCallbacks.CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the bandwidth of the upstream (from Mobile SDK to Payload). The unit is bytes/s.  The bandwidth is determined by the firmware and currently it is not larger than 500 bytes/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getpayloadproductname"><div class="api-col left">Product Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getpayloadproductname_inline">getPayloadProductName</a></div></div><div class="inline-doc" id="djipayload_getpayloadproductname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPayloadProductName</h6></div>

~~~java
 String getPayloadProductName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the product name defined by the manufacturer of the payload device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The product name of the payload device.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_isdjivideostreamingchannelavailable"><div class="api-col left">Check Video Streaming Channel Available</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_isdjivideostreamingchannelavailable_inline">isDJIVideoStreamingChannelAvailable</a></div></div><div class="inline-doc" id="djipayload_isdjivideostreamingchannelavailable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDJIVideoStreamingChannelAvailable</h6></div>

~~~java
 boolean isDJIVideoStreamingChannelAvailable() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">When it returns <code>true</code>, video stream type on PSDK is set to DJI video streaming channel. Please use <code><a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html#djivideofeeder_videodatalistenerinterface">VideoDataListener</a></code> in <code>DJIVideoFeeder</code> to receive the video data. When it returns <code>false</code>, video stream type on PSDK is set to custom video streaming channel.  Please use <code>DJIPayload_DJIPayloadDelegate_didReceiveVideoData</code> in <code>DJIPayload</code> to receive custom video data.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if DJI video streaming channel is available.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_configurewidgetvalue"><div class="api-col left">Widget Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_configurewidgetvalue_inline">configureWidgetValue</a></div></div><div class="inline-doc" id="djipayload_configurewidgetvalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>configureWidgetValue</h6></div>

~~~java
 void configureWidgetValue(int index, PayloadWidget.PayloadWidgetType type, int value, CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the value for a widget of the payload device. 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>.<a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">type</td><td><font color="#666"><i>Type of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">value</td><td><font color="#666"><i>Value of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getwidget"><div class="api-col left">Get Widget</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getwidget_inline">getWidget</a></div></div><div class="inline-doc" id="djipayload_getwidget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWidget</h6></div>

~~~java
 PayloadWidget getWidget(int widgetIndex, PayloadWidget.PayloadWidgetType widgetType) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets a widget by specifying the widget type and the index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetIndex</td><td><font color="#666"><i>The index of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>.<a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">widgetType</td><td><font color="#666"><i>The type of the widget.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a></td><td><font color="#666"><i>The widget corresponding to the widget type and the index. <code>null</code> if the widgets are not ready or there is no widget corresponding  to the widget type and the index.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getwidgets"><div class="api-col left">Get Widgets</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getwidgets_inline">getWidgets</a></div></div><div class="inline-doc" id="djipayload_getwidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWidgets</h6></div>

~~~java
 PayloadWidget[] getWidgets() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the full list of widgets on the payload device. A new instance of "NSArray" is returned when one of the widget is updated. Please use <code><a href="/Components/Payload/DJIPayload.html#djipayload_getconfiginterfacewidgets">getConfigInterfaceWidgets</a></code> instead.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>[]</td><td><font color="#666"><i>The full list of widgets. <code>null</code> if the widgets are not fetched yet.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getmaininterfacewidgets"><div class="api-col left">Get Main Interface Widgets</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getmaininterfacewidgets_inline">getMainInterfaceWidgets</a></div></div><div class="inline-doc" id="djipayload_getmaininterfacewidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMainInterfaceWidgets</h6></div>

~~~java
 PayloadWidget[] getMainInterfaceWidgets() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the main interface widget list on the payload device. An empty array will be returned if the payload's data is regarded as invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>[]</td><td><font color="#666"><i>A list of widgets. Returns nil if no widgets are fetched.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getconfiginterfacewidgets"><div class="api-col left">Get Config Interface Widgets</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getconfiginterfacewidgets_inline">getConfigInterfaceWidgets</a></div></div><div class="inline-doc" id="djipayload_getconfiginterfacewidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getConfigInterfaceWidgets</h6></div>

~~~java
 PayloadWidget[] getConfigInterfaceWidgets() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the configuration interface widget list on the payload device. An empty array will be returned if the payload's data is regarded as invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>[]</td><td><font color="#666"><i>A list of widgets. Returns nil if no widgets are fetched.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_senddatatopayload"><div class="api-col left">Send Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_senddatatopayload_inline">sendDataToPayload</a></div></div><div class="inline-doc" id="djipayload_senddatatopayload_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendDataToPayload</h6></div>

~~~java
 void sendDataToPayload(byte[] data, CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Sends data to payload. <br> - The length of the data to send cannot exceed 32 bytes for Matrice 200 series. <br> - The length of the  data to send cannot exceed 128 bytes for Matrice 200 V2 series. The throughput cannot exceed the bandwidth returned by <code><a href="/Components/Payload/DJIPayload.html#djipayload_getupstreambandwidth">getUpstreamBandwidth</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">data</td><td><font color="#666"><i>Data that will be sent to the payload device.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getdevicetype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getdevicetype_inline">getDeviceType</a></div></div><div class="inline-doc" id="djipayload_getdevicetype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDeviceType</h6></div>

~~~java
 PayloadDeviceType getDeviceType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the device type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloaddevicetype">PayloadDeviceType</a></td><td><font color="#666"><i>Get an enum value of <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloaddevicetype">PayloadDeviceType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getproductphase"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getproductphase_inline">getProductPhase</a></div></div><div class="inline-doc" id="djipayload_getproductphase_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProductPhase</h6></div>

~~~java
 PayloadProductPhase getProductPhase() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets current payload product phase.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase">PayloadProductPhase</a></td><td><font color="#666"><i>Get the enum value of <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase">PayloadProductPhase</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_isfeatureopened"><div class="api-col left">Check Feature Open</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_isfeatureopened_inline">isFeatureOpened</a></div></div><div class="inline-doc" id="djipayload_isfeatureopened_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFeatureOpened</h6></div>

~~~java
 boolean isFeatureOpened() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Gets the product feature open status. If the product's feature isn't fully opened, there are several  possibilities. <br> - Payload status is abnormal. <br> - PSDK is not bound. <br> - Encryption chip  exception. <br> - The aircraft doesn't support this Payload model.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the product is activated.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_addwidgetvaluechangedcallback"><div class="api-col left">Add Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_addwidgetvaluechangedcallback_inline">addWidgetValueChangedCallback</a></div></div><div class="inline-doc" id="djipayload_addwidgetvaluechangedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addWidgetValueChangedCallback</h6></div>

~~~java
 void addWidgetValueChangedCallback(int index, PayloadWidget.PayloadWidgetType type, WidgetValueChangedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set a callback for the specific widget, if the value of the widget is changed, the callback will be called.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>.<a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">type</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_removewidgetvaluechangedcallbackwithindexandtype"><div class="api-col left">Remove Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_removewidgetvaluechangedcallbackwithindexandtype_inline">removeWidgetValueChangedCallback</a></div></div><div class="inline-doc" id="djipayload_removewidgetvaluechangedcallbackwithindexandtype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWidgetValueChangedCallback</h6></div>

~~~java
 void removeWidgetValueChangedCallback(int index, PayloadWidget.PayloadWidgetType type, WidgetValueChangedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Remove a callback for the widget.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>.<a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">type</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_removewidgetvaluechangedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_removewidgetvaluechangedcallback_inline">removeWidgetValueChangedCallback</a></div></div><div class="inline-doc" id="djipayload_removewidgetvaluechangedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWidgetValueChangedCallback</h6></div>

~~~java
 void removeWidgetValueChangedCallback(WidgetValueChangedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Remove a callback for the widget.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html#djipayload_widgetvaluechangedcallbackinterface">WidgetValueChangedCallback</a></code>.</i></td></tr></table></html></div>



#### State Updates

<div class="api-row" id="djipayload_setmessagecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_setmessagecallback_inline">setMessageCallback</a></div></div><div class="inline-doc" id="djipayload_setmessagecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMessageCallback</h6></div>

~~~java
 void setMessageCallback(HintMessageCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the message callback, message is a string, the content of string is determined by firmware,  it could be changed dynamically.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_HintMessageCallbackInterface.html#djipayload_hintmessagecallbackinterface">HintMessageCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_HintMessageCallbackInterface.html#djipayload_hintmessagecallbackinterface">HintMessageCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_setcommanddatacallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_setcommanddatacallback_inline">setCommandDataCallback</a></div></div><div class="inline-doc" id="djipayload_setcommanddatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCommandDataCallback</h6></div>

~~~java
 void setCommandDataCallback(CommandDataCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the command data callback, the command data typically sent by payload in UART/CAN channel, the max bandwidth  of this channel is 3KBytes/s on M200.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_CommandDataCallbackInterface.html#djipayload_commanddatacallbackinterface">CommandDataCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_CommandDataCallbackInterface.html#djipayload_commanddatacallbackinterface">CommandDataCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_setvideodatareceivedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_setvideodatareceivedcallback_inline">setVideoDataReceivedCallback</a></div></div><div class="inline-doc" id="djipayload_setvideodatareceivedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoDataReceivedCallback</h6></div>

~~~java
 void setVideoDataReceivedCallback(VideoDataReceivedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the video data callback, the video data from the payload device. The data may be live view or playback.  Only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_VideoDataReceivedCallbackInterface.html#djipayload_videodatareceivedcallbackinterface">VideoDataReceivedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_VideoDataReceivedCallbackInterface.html#djipayload_videodatareceivedcallbackinterface">VideoDataReceivedCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_setstreamdatacallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_setstreamdatacallback_inline">setStreamDataCallback</a></div></div><div class="inline-doc" id="djipayload_setstreamdatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStreamDataCallback</h6></div>

~~~java
 void setStreamDataCallback(StreamDataCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the UDP data callback, this callback is for receiving the Non-Video data in UDP channel, the max bandwidth of  this channel is 8Mbps in M200, 4Mbps in M210.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_StreamDataCallbackInterface.html#djipayload_streamdatacallbackinterface">StreamDataCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/Payload/DJIPayload_StreamDataCallbackInterface.html#djipayload_streamdatacallbackinterface">StreamDataCallback</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djipayload_payloadwidget"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_PayloadWidget.html">PayloadWidget</a></div></div><div class="api-row" id="djipayload_hintmessagecallbackinterface"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_HintMessageCallbackInterface.html">HintMessageCallback</a></div></div><div class="api-row" id="djipayload_commanddatacallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_CommandDataCallbackInterface.html">CommandDataCallback</a></div></div><div class="api-row" id="djipayload_videodatareceivedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_VideoDataReceivedCallbackInterface.html">VideoDataReceivedCallback</a></div></div><div class="api-row" id="djipayload_streamdatacallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_StreamDataCallbackInterface.html">StreamDataCallback</a></div></div><div class="api-row" id="djipayload_widgetvaluechangedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_WidgetValueChangedCallbackInterface.html">WidgetValueChangedCallback</a></div></div><div class="api-row" id="djipayload_fetchwidgetconfiguration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_fetchwidgetconfiguration_inline">fetchPayloadWidgetsFile</a></div></div><div class="inline-doc" id="djipayload_fetchwidgetconfiguration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchPayloadWidgetsFile</h6></div>

~~~java
 void fetchPayloadWidgetsFile(final PayloadWidgetDownloadListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Fetches widget configuration. Mobile SDK will fetch the configuration when it first launches.  Returns nil if initial fetching failed. It is only supported by DJI SKYPORT 2.0.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Payload/DJIPayload_PayloadWidgetDownloadListener.html#djipayload_payloadwidgetdownloadlistener">PayloadWidgetDownloadListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener of <code><a href="/Components/Payload/DJIPayload_PayloadWidgetDownloadListener.html#djipayload_payloadwidgetdownloadlistener">PayloadWidgetDownloadListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_setpayloadchannelpriority"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_setpayloadchannelpriority_inline">setPayloadChannelPriority</a></div></div><div class="inline-doc" id="djipayload_setpayloadchannelpriority_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPayloadChannelPriority</h6></div>

~~~java
 void setPayloadChannelPriority(@NonNull VideoFeedPriority priority, @NonNull PhysicalSource physicalSource, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Set the channel priority of the payload. Priority will affect the bandwidth allocation if it is not <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_unknown">UNKNOWN</a></code>,  which is the default value. For example, if the data that comes from the payload device mounted on left gimbal is preferred, please set the priority  to <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_high">HIGH</a></code>, and physicalSource is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>.  The others should be set to <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_medium">MEDIUM</a></code> or <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_low">LOW</a></code>.  Only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a> <font color="#000">priority</td><td><font color="#666"><i>The priority to be set, see <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a> <font color="#000">physicalSource</td><td><font color="#666"><i>See <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_getpayloadchannelpriorityonphysicalsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_getpayloadchannelpriorityonphysicalsource_inline">getPayloadChannelPriority</a></div></div><div class="inline-doc" id="djipayload_getpayloadchannelpriorityonphysicalsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPayloadChannelPriority</h6></div>

~~~java
 void getPayloadChannelPriority(@NonNull PhysicalSource physicalSource,  @NonNull CommonCallbacks.CompletionCallbackWith<VideoFeedPriority> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the channel priority of the payload. Only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a> <font color="#000">physicalSource</td><td><font color="#666"><i>See <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_djipayloadproductphase"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloadproductphase_inline">PayloadProductPhase</a></div></div><div class="inline-doc" id="djipayload_djipayloadproductphase_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PayloadProductPhase</h6></div>

~~~java
 enum PayloadProductPhase 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Development phase has more settings than product phase, including control parameters auto-tuning,  coaxiality detection, balance detection, stiffness adjustment. Please note that this phase should be  used with DJI Assistant 2, which has bound with Payload SDK developer account. Product phase means  that the product is in the stage ready to sell. During this stage, development settings, i.e., control  parameters auto-tuning, coaxiality detection, balance detection, stiffness adjustment, should be hidden from user interface.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloadproductphase_development_inline"></a>DEVELOPMENT</td><td><font color="#666">The product is in the development phase.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloadproductphase_release_inline"></a>RELEASE</td><td><font color="#666">The product is in the release phase.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloadproductphase_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djipayload_djipayloaddevicetype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddevicetype_inline">PayloadDeviceType</a></div></div><div class="inline-doc" id="djipayload_djipayloaddevicetype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PayloadDeviceType</h6></div>

~~~java
 enum PayloadDeviceType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">All the possible mode of <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloaddevicetype">PayloadDeviceType</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloaddevicetype_dji_skyport_1_inline"></a>DJI_SKYPORT_1</td><td><font color="#666">DJI Skyport 1.0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloaddevicetype_dji_skyport_2_inline"></a>DJI_SKYPORT_2</td><td><font color="#666">DJI Skyport 2.0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloaddevicetype_dji_x_port_inline"></a>DJI_X_PORT</td><td><font color="#666">DJI X-Port.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_djipayloaddevicetype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djipayload_activateinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_ActivateInfo.html">ActivateInfo</a></div></div>

##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


