<div class="article"><h1 ><font color="#AAA">class </font>WidgetValueChangedCallback</h1></div>

~~~java
 interface WidgetValueChangedCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">This interface provides a callback to get value of the widget when changed.



##### Class Members:



#### Callback Method

<div class="api-row" id="djipayload_djipayloaddelegate_didupdatewidgets"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didupdatewidgets_inline">onWidgetValueChanged</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didupdatewidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onWidgetValueChanged</h6></div>

~~~java
        void onWidgetValueChanged(PayloadWidget.PayloadWidgetType type, int index, int newValue)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Called when the value of the widget is changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget">PayloadWidget</a>.<a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">type</td><td><font color="#666"><i>The enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">newValue</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


