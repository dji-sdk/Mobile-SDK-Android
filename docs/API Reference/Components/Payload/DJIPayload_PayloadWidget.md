<div class="article"><h1 ><font color="#AAA">class </font>PayloadWidget</h1></div>

~~~java
 class PayloadWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Class to represent the properties of a payload widget. Payload SDK defines  different types of widgets for the interaction between the payload device  and the mobile device.



##### Class Members:

<div class="api-row" id="djipayload_payloadwidget_type"><div class="api-col left">Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_type_inline">getWidgetType</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_type_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWidgetType</h6></div>

~~~java
 PayloadWidgetType getWidgetType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the type of the widget. Different types have different type of values.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></td><td><font color="#666"><i>The type of the payload widget.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_index"><div class="api-col left">Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_index_inline">getWidgetIndex</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWidgetIndex</h6></div>

~~~java
 int getWidgetIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the index of the widget. An index is used to differentiate widgets of the same type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The index of the payload widget, same type of widgets must have different index.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_value"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_value_inline">getWidgetValue</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_value_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWidgetValue</h6></div>

~~~java
 int getWidgetValue() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the value of the payload widget.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The value of the payload widget, the widget of INPUT type will return an int value of 0(normal) or 1(pressed), SWITCH  type will return a int value of 0(switch off) or 1(switch on), RANGE type will return a int value from 0 to 100 (inclusive),  LIST type will return a int value from 0 to N (N is determined by firmware), INPUT type will return any int value which is set previously.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_name"><div class="api-col left">Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_name_inline">getName</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_name_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the name of the widget. This is determined by the payload device and not configurable  through the mobile device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The name of the payload widget.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_gethintmsg"><div class="api-col left">Hint Message</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_gethintmsg_inline">getHintMsg</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_gethintmsg_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHintMsg</h6></div>

~~~java
 String getHintMsg() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the hint message of the payload widget.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The hint message of the payload widget, "INPUT" type of widget might has a hint message which describe the function of the widget.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_getsubitems"><div class="api-col left">Sub Items</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_getsubitems_inline">getSubItems</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_getsubitems_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSubItems</h6></div>

~~~java
 List<String> getSubItems() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Get the sub items list of the payload widget.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;String&gt;</td><td><font color="#666"><i>The sub items list of the payload widget, LIST type widget could return the sub items, which describe the options or different functions  related with the widget value, for example, if the widget has a list of sub items with size of 5, then the widget could accept the  widget value between 0 to 4 (inclusive), the string with index of 0 will describe the function if the widget value of 0 is set.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_constructor_inline">PayloadWidget</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>PayloadWidget</h6></div>

~~~java
 PayloadWidget(PayloadWidgetType widgetType, int widgetIndex, int widgetValue, String name) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Common widget information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">widgetType</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetIndex</td><td><font color="#666"><i>The widget index.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetValue</td><td><font color="#666"><i>The value of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">name</td><td><font color="#666"><i>The widget name.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_constructor_withhint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_constructor_withhint_inline">PayloadWidget</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_constructor_withhint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>PayloadWidget</h6></div>

~~~java
 PayloadWidget(PayloadWidgetType widgetType, int widgetIndex, int widgetValue, String name, String hintMsg) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Common widget information with message hint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">widgetType</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetIndex</td><td><font color="#666"><i>The widget index.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetValue</td><td><font color="#666"><i>The value of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">name</td><td><font color="#666"><i>The widget name.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">hintMsg</td><td><font color="#666"><i>A hint message string.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_constructor_list"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_constructor_list_inline">PayloadWidget</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_constructor_list_inline"

><div class="article"><h6 ><font color="#AAA">method </font>PayloadWidget</h6></div>

~~~java
 PayloadWidget(PayloadWidgetType widgetType, int widgetIndex, int widgetValue, String name, List<String> subItems) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">List widget information with the sub items.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">widgetType</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetIndex</td><td><font color="#666"><i>The widget index.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetValue</td><td><font color="#666"><i>The value of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">name</td><td><font color="#666"><i>The widget name.</i></td></tr><tr valign="top"><td><font color="#70BF41">List&lt;String&gt; <font color="#000">subItems</td><td><font color="#666"><i>A list of sub items strings.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidget_constructor_list_withhint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_constructor_list_withhint_inline">PayloadWidget</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_constructor_list_withhint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>PayloadWidget</h6></div>

~~~java
 PayloadWidget(PayloadWidgetType widgetType,
                         int widgetIndex,
                         int widgetValue,
                         String name,
                         String hintMsg,
                         List<String> subItems) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">List widget information with the sub items and message hint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a> <font color="#000">widgetType</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Payload/DJIPayload_PayloadWidget.html#djipayload_payloadwidget_widgettype">PayloadWidgetType</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetIndex</td><td><font color="#666"><i>The widget index.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">widgetValue</td><td><font color="#666"><i>The value of the widget.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">name</td><td><font color="#666"><i>The widget name.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">hintMsg</td><td><font color="#666"><i>A hint message string.</i></td></tr><tr valign="top"><td><font color="#70BF41">List&lt;String&gt; <font color="#000">subItems</td><td><font color="#666"><i>A list of sub items strings.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djipayload_payloadwidget_widgettype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidget_widgettype_inline">PayloadWidgetType</a></div></div><div class="inline-doc" id="djipayload_payloadwidget_widgettype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PayloadWidgetType</h6></div>

~~~java
 enum PayloadWidgetType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Types of widgets on the payload device.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_none_inline"></a>UNKNOWN</td><td><font color="#666">Other unknown widget type.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_button_inline"></a>BUTTON</td><td><font color="#666">Button, button widget could return the widget value of 1 or 0, normally it's widget value is 0, when  the button is being pressed the widget value will change to 1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_switch_inline"></a>SWITCH</td><td><font color="#666">Switch, switch widget could return the widget value of 1 or 0, when the switch is changed  to "ON" state, the widget value will change to 1, if the switch is changed to "OFF" state,  the widget value will change to 0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_range_inline"></a>RANGE</td><td><font color="#666">Range, range widget could return the widget value between 0 - 100 (inclusive).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_list_inline"></a>LIST</td><td><font color="#666">List, list widget could return the int value between 0 and N, N is determined by the firmware,  the size of sub items returned by getSubItems() method in PayloadWidget will be N+1</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipayload_payloadwidget_widgettype_input_inline"></a>INPUT</td><td><font color="#666">Input widget could be set with any int value, the default value is determined by the firmware.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djipayload_payloadwidgetlistener"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_PayloadWidgetListener.html">PayloadWidgetListener</a></div></div><div class="api-row" id="djipayload_payloadwidgetdownloadlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Payload/DJIPayload_PayloadWidgetDownloadListener.html">PayloadWidgetDownloadListener</a></div></div>
