<div class="article"><h1 ><font color="#AAA">class </font>SSDClipFileName</h1></div>

~~~java
 static class SSDClipFileName 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The name of a video file stored in SSD.



##### Class Members:

<div class="api-row" id="djicamera_djicamerassdclipfilenameinterface_equipmentlabel"><div class="api-col left">Equipment Label</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdclipfilenameinterface_equipmentlabel_inline">getEquipmentLabel</a></div></div><div class="inline-doc" id="djicamera_djicamerassdclipfilenameinterface_equipmentlabel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEquipmentLabel</h6></div>

~~~java
 String getEquipmentLabel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">A single captical character represents the equipment. The possible value is from 'A' to 'Z'.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string value of the equipment label.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdclipfilenameinterface_reelid"><div class="api-col left">Reel ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdclipfilenameinterface_reelid_inline">getReelID</a></div></div><div class="inline-doc" id="djicamera_djicamerassdclipfilenameinterface_reelid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getReelID</h6></div>

~~~java
 int getReelID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The reel ID. The possible value is from 0 to 999.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the reel ID.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdclipfilenameinterface_clipid"><div class="api-col left">Clip ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdclipfilenameinterface_clipid_inline">getClipID</a></div></div><div class="inline-doc" id="djicamera_djicamerassdclipfilenameinterface_clipid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getClipID</h6></div>

~~~java
 int getClipID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The clip ID. The possible value is from 0 to 999.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the clip ID.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdclipfilenameinterface_initwithequipmentlabel"><div class="api-col left">Init</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdclipfilenameinterface_initwithequipmentlabel_inline">SSDClipFileName</a></div></div><div class="inline-doc" id="djicamera_djicamerassdclipfilenameinterface_initwithequipmentlabel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>SSDClipFileName</h6></div>

~~~java
 SSDClipFileName(String label, int reelID, int clipID) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Create a SSD clip name instance.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">label</td><td><font color="#666"><i>The equipment label of the clip. The valid input is from 'A' to 'Z'.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">reelID</td><td><font color="#666"><i>The reel ID. The valid input is from 0 to 999.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">clipID</td><td><font color="#666"><i>The clip ID. The valid input is from 0 to 999.</i></td></tr></table></html></div>


