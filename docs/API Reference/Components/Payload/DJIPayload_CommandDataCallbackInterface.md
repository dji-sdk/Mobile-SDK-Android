<div class="article"><h1 ><font color="#AAA">class </font>CommandDataCallback</h1></div>

~~~java
 interface CommandDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">This interface provides a callback to get command data sent from payload to the Mobile SDK.



##### Class Members:



#### Callback Method

<div class="api-row" id="djipayload_djipayloaddelegate_didreceivecommanddata"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didreceivecommanddata_inline">onGetCommandData</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didreceivecommanddata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onGetCommandData</h6></div>

~~~java
        void onGetCommandData(byte[] data)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">When the payload send some command bytes to the Mobile SDK, this method will be called.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">data</td><td><font color="#666"><i>The received command data.</i></td></tr></table></html></div>


