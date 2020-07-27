<div class="article"><h1 ><font color="#AAA">class </font>HintMessageCallback</h1></div>

~~~java
 interface HintMessageCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">This interface provides a callback to get messages sent from payload to the Mobile SDK.



##### Class Members:



#### Callback Method

<div class="api-row" id="djipayload_djipayloaddelegate_didreceivemessage"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didreceivemessage_inline">onGetMessage</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didreceivemessage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onGetMessage</h6></div>

~~~java
        void onGetMessage(String str)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">when the payload send some message string to the Mobile SDK, this method will be called.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">str</td><td><font color="#666"><i>Hint message string.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_djipayloaddelegate_didupdatemaininterfacewidgets"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didupdatemaininterfacewidgets_inline">setMainInterfaceWidgetsListener</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didupdatemaininterfacewidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMainInterfaceWidgetsListener</h6></div>

~~~java
 void setMainInterfaceWidgetsListener(PayloadWidgetListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Updates a set of payload shortcuts in main interface. if the pay load's data is invalid, an  empty array will be updated. It is only supported by DJI Skyport 2.0 and DJI X-Port.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidgetListener.html#djipayload_payloadwidgetlistener">PayloadWidgetListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener received the updated widget values.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_djipayloaddelegate_didupdateconfiginterfacewidgets"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didupdateconfiginterfacewidgets_inline">setConfigWidgetsListener</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didupdateconfiginterfacewidgets_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setConfigWidgetsListener</h6></div>

~~~java
 void setConfigWidgetsListener(PayloadWidgetListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">Updates setting for payload widgets. If the pay load's data is invalid, an empty array will be updated.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Payload/DJIPayload_PayloadWidgetListener.html#djipayload_payloadwidgetlistener">PayloadWidgetListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener received the updated widget values.</i></td></tr></table></html></div>


