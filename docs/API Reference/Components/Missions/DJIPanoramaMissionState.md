<div class="article"><h1 ><font color="#AAA">class </font>PanoramaMissionState</h1></div>

~~~java
@EXClassNullAway
 class PanoramaMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">Panorama Mission State.



##### Class Members:



#### Members

<div class="api-row" id="djipanoramamissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djipanoramamissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final PanoramaMissionState UNKNOWN = new PanoramaMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. This is the initial state when the operator  has just been created.

</div>

<div class="api-row" id="djipanoramamissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djipanoramamissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final PanoramaMissionState DISCONNECTED = new PanoramaMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and Osmo is broken.

</div>

<div class="api-row" id="djipanoramamissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_notsupported_inline">NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djipanoramamissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORTED</h6></div>

~~~java
 static final PanoramaMissionState NOT_SUPPORTED = new PanoramaMissionState("NOT_SUPPORTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support Panorama mission.

</div>

<div class="api-row" id="djipanoramamissionstate_readytosetup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_readytosetup_inline">READY_TO_SETUP</a></div></div><div class="inline-doc" id="djipanoramamissionstate_readytosetup_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_SETUP</h6></div>

~~~java
 static final PanoramaMissionState READY_TO_SETUP = new PanoramaMissionState("READY_TO_SETUP")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The operator is ready to setup a Panorama mission.

</div>

<div class="api-row" id="djipanoramamissionstate_settingup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_settingup_inline">SETTING_UP</a></div></div><div class="inline-doc" id="djipanoramamissionstate_settingup_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SETTING_UP</h6></div>

~~~java
 static final PanoramaMissionState SETTING_UP = new PanoramaMissionState("SETTING_UP")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The operator is setting up for a Panorama mission.

</div>

<div class="api-row" id="djipanoramamissionstate_readytoexecute"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_readytoexecute_inline">READY_TO_EXECUTE</a></div></div><div class="inline-doc" id="djipanoramamissionstate_readytoexecute_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_EXECUTE</h6></div>

~~~java
 static final PanoramaMissionState READY_TO_EXECUTE = new PanoramaMissionState("READY_TO_EXECUTE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The setup for the Panorama mission is complete. The operator is ready to  start the execution.

</div>

<div class="api-row" id="djipanoramamissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djipanoramamissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final PanoramaMissionState EXECUTING = new PanoramaMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The operator is executing a Panorama mission.

</div>


