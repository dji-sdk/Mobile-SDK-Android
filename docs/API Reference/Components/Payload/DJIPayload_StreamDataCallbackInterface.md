<div class="article"><h1 ><font color="#AAA">class </font>StreamDataCallback</h1></div>

~~~java
 interface StreamDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">This interface provides a callback to get stream data sent from payload to the Mobile SDK.



##### Class Members:



#### Callback Method

<div class="api-row" id="djipayload_djipayloaddelegate_didreceivestreamdata"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_djipayloaddelegate_didreceivestreamdata_inline">onGetStreamData</a></div></div><div class="inline-doc" id="djipayload_djipayloaddelegate_didreceivestreamdata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onGetStreamData</h6></div>

~~~java
        void onGetStreamData(byte[] data, int len)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.payload</td></tr></table></html>



##### Description:



<font color="#666">When the payload send the bytes to the Mobile SDK by UDP channel, this method will be called,  note that if dealing of the data block the data feeder, the byte might lost.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">data</td><td><font color="#666"><i>The received stream data.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">len</td><td><font color="#666"><i>Valid length of the data.</i></td></tr></table></html></div>


