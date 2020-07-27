<div class="article"><h1 ><font color="#AAA">class </font>LDMCallback</h1></div>

~~~java
 interface LDMCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">LDM callback interface, callback will always be invoked in background thread.



##### Class Members:



#### Callback Method

<div class="api-row" id="djildmmanager_onldmenabledchangecallback"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_onldmenabledchangecallback_inline">onLDMEnabledChange</a></div></div><div class="inline-doc" id="djildmmanager_onldmenabledchangecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLDMEnabledChange</h6></div>

~~~java
        void onLDMEnabledChange(boolean isEnabled)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Called when the LDM availability is changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>TRUE if LDM enabled.</i></td></tr></table></html></div>

<div class="api-row" id="djildmmanager_onldmsupportedchangecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djildmmanager_onldmsupportedchangecallback_inline">onLDMSupportedChange</a></div></div><div class="inline-doc" id="djildmmanager_onldmsupportedchangecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLDMSupportedChange</h6></div>

~~~java
        void onLDMSupportedChange(boolean isSupported)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">If the value changes to false, LDM will be disable after 5 minutes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isSupported</td><td><font color="#666"><i>TRUE if LDM is supported.</i></td></tr></table></html></div>


