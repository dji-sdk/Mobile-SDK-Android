<div class="article"><h1 ><font color="#AAA">class </font>ComponentListener</h1></div>

~~~java
 interface ComponentListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Receives notifications of component connectivity changes.



##### Class Members:

<div class="api-row" id="djibasecomponent_connectivitychanged"><div class="api-col left">Connectivity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connectivitychanged_inline">onConnectivityChange</a></div></div><div class="inline-doc" id="djibasecomponent_connectivitychanged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onConnectivityChange</h6></div>

~~~java
 void onConnectivityChange(boolean isConnected)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Called when the connectivity status has changes for the component. This callback  will be called when the component disconnects from the product. If the product itself gets disconnected,  this callback method will be called by all of the product component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isConnected</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>


