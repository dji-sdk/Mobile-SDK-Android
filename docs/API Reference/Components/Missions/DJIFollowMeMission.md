<div class="article"><h1 ><font color="#AAA">class </font>FollowMeMission</h1></div>

~~~java
@EXClassNullAway
 class FollowMeMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The class represents a Follow Me mission. In a Follow Me mission, the aircraft  is programmed to track and maintain a constant distant relative to some object,  such as a person or a moving vehicle. You can use it to make the aircraft follow  a GPS device, such as a remote controller with a GPS signal or a mobile device.  It is not supported by Mavic Pro when using WiFi connection. It is not supported  by Spark.



##### Class Members:

<div class="api-row" id="djifollowmemission_followmelatitude"><div class="api-col left">Latitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemission_followmelatitude_inline">getLatitude</a></div></div><div class="inline-doc" id="djifollowmemission_followmelatitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLatitude</h6></div>

~~~java
 double getLatitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Latitude of the mission's initial target location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemission_followmelongitude"><div class="api-col left">Longitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemission_followmelongitude_inline">getLongitude</a></div></div><div class="inline-doc" id="djifollowmemission_followmelongitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLongitude</h6></div>

~~~java
 double getLongitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Longitude of the mission's initial target location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemission_followmealtitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemission_followmealtitude_inline">getAltitude</a></div></div><div class="inline-doc" id="djifollowmemission_followmealtitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAltitude</h6></div>

~~~java
 float getAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Initial altitude (above sea level) in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemission_heading"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemission_heading_inline">getHeading</a></div></div><div class="inline-doc" id="djifollowmemission_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 FollowMeHeading getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's heading during the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIFollowMeMission.html#djifollowmemission_djifollowmeheading">FollowMeHeading</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIFollowMeMission.html#djifollowmemission_djifollowmeheading">FollowMeHeading</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djifollowmemission_djifollowmeheading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djifollowmemission_djifollowmeheading_inline">FollowMeHeading</a></div></div><div class="inline-doc" id="djifollowmemission_djifollowmeheading_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FollowMeHeading</h6></div>

~~~java
@EXClassNullAway
 enum FollowMeHeading 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Aircraft's heading during a follow me mission.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djifollowmemission_djifollowmeheading_towardfollowposition_inline"></a>TOWARD_FOLLOW_POSITION</td><td><font color="#666">Aircraft's heading remains toward the coordinate it is following.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djifollowmemission_djifollowmeheading_controlledbyremotecontroller_inline"></a>CONTROLLED_BY_REMOTE_CONTROLLER</td><td><font color="#666">Aircraft's heading will be controlled by the remote controller.</td></tr></table></html>

##### Class Members:

</div>


