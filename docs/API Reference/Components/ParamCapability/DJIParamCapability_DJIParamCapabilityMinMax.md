<div class="article"><h1 ><font color="#AAA">class </font>DJIParamMinMaxCapability</h1></div>

~~~java
@EXClassNullAway
 class DJIParamMinMaxCapability extends DJIParamCapability 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code></td></tr></table></html>



##### Description:



<font color="#666">Adds the maximum and minimum possible values of the parameter to  the <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code> base class.



##### Class Members:

<div class="api-row" id="djiparamcapability_djiparamcapabilityminmax_min"><div class="api-col left">Minimum Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiparamcapability_djiparamcapabilityminmax_min_inline">getMin</a></div></div><div class="inline-doc" id="djiparamcapability_djiparamcapabilityminmax_min_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMin</h6></div>

~~~java
 Number getMin() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Return the valid minimum value of the  parameter for the product. If <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability_issupported">isSupported</a></code>  returns <code>false</code>, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Number</td><td><font color="#666"><i>A Number object.</i></td></tr></table></html></div>

<div class="api-row" id="djiparamcapability_djiparamcapabilityminmax_max"><div class="api-col left">Maximum Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiparamcapability_djiparamcapabilityminmax_max_inline">getMax</a></div></div><div class="inline-doc" id="djiparamcapability_djiparamcapabilityminmax_max_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMax</h6></div>

~~~java
 Number getMax() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Return the valid maximum value of the  parameter for the product. If <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability_issupported">isSupported</a></code>  returns <code>false</code>, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Number</td><td><font color="#666"><i>A Number object.</i></td></tr></table></html></div>



##### Inherited Methods:

<div class="api-row" id="djiparamcapability_issupported"><div class="api-col left">dji.common.util.DJIParamCapability</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiparamcapability_issupported_inline">isSupported</a></div></div><div class="inline-doc" id="djiparamcapability_issupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSupported</h6></div>

~~~java
 boolean isSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component or product supports the parameter.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


