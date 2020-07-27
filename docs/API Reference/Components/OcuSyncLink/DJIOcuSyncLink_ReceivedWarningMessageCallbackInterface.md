<div class="article"><h1 ><font color="#AAA">class </font>WarningMessagesCallback</h1></div>

~~~java
 interface WarningMessagesCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated OcuSync link warning messages. This delegate method is called only when there are new warning messages on  the OcuSync link (either uplink or downlink). If the array has no elements, then all previous warning messages are  no longer in effect.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiocusynclink_didreceivewarningmessages"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_didreceivewarningmessages_inline">onReceive</a></div></div><div class="inline-doc" id="djiocusynclink_didreceivewarningmessages_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onReceive</h6></div>

~~~java
        void onReceive(OcuSyncWarningMessage[] messages)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated OcuSync link warning messages. This delegate method is called only when there are new warning messages  on the OcuSync link (either uplink or downlink). If the array has no elements, then all previous warning  messages are no longer in effect.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncwarningmessage">OcuSyncWarningMessage</a>[] <font color="#000">messages</td><td><font color="#666"><i>The array of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncwarningmessage">OcuSyncWarningMessage</a></code> representation of the current Warning Messages.</i></td></tr></table></html></div>


