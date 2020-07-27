<div class="article"><h1 ><font color="#AAA">class </font>UnlockedZoneGroup</h1></div>

~~~java
 class UnlockedZoneGroup 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">An unlocked zone group contains the self-unlocked fly zones and custom unlock zones for an aircraft.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiunlockedzonegroup_sn"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiunlockedzonegroup_sn_inline">getSn</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiunlockedzonegroup_sn_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSn</h6></div>

~~~java
 String getSn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The serial number of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string instance of the unlocked zone group serial number.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiunlockedzonegroup_selfunlockedflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiunlockedzonegroup_selfunlockedflyzones_inline">getSelfUnlockedFlyZones</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiunlockedzonegroup_selfunlockedflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelfUnlockedFlyZones</h6></div>

~~~java
 List<FlyZoneInformation> getSelfUnlockedFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The self-unlocked authorization fly zones for the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiunlockedzonegroup_customunlockzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiunlockedzonegroup_customunlockzones_inline">getCustomUnlockZones</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiunlockedzonegroup_customunlockzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockZones</h6></div>

~~~java
 List<CustomUnlockZone> getCustomUnlockZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The custom unlock zones for the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone">CustomUnlockZone</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone">CustomUnlockZone</a></code> objects.</i></td></tr></table></html></div>


