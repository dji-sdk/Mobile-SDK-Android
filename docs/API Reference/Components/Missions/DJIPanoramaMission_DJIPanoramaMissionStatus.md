<div class="article"><h1 ><font color="#AAA">class </font>PanoramaMissionExecutionState</h1></div>

~~~java
@EXClassNullAway
 class PanoramaMissionExecutionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">This class provides the real-time status of an executing Panorama mission.



##### Class Members:

<div class="api-row" id="djipanoramamission_djipanoramamissionstatus_totalnumber"><div class="api-col left">Total Number</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamission_djipanoramamissionstatus_totalnumber_inline">getTotalNumber</a></div></div><div class="inline-doc" id="djipanoramamission_djipanoramamissionstatus_totalnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTotalNumber</h6></div>

~~~java
 int getTotalNumber() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The total number of photos that will be shot during the mission. In full circle mode,  the number should be 8. In the half circle mode, the number should be 5.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of total shot photo number.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamission_djipanoramamissionstatus_currentshotnumber"><div class="api-col left">Current Number</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamission_djipanoramamissionstatus_currentshotnumber_inline">getCurrentShotNumber</a></div></div><div class="inline-doc" id="djipanoramamission_djipanoramamissionstatus_currentshotnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentShotNumber</h6></div>

~~~java
 int getCurrentShotNumber() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The number of photos that have been shot.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of current shot photo number.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamission_djipanoramamissionstatus_currentsavednumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamission_djipanoramamissionstatus_currentsavednumber_inline">getCurrentSavedNumber</a></div></div><div class="inline-doc" id="djipanoramamission_djipanoramamissionstatus_currentsavednumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentSavedNumber</h6></div>

~~~java
 int getCurrentSavedNumber() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The number of photos that have been saved to SD card.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of current saved photo number.</i></td></tr></table></html></div>


