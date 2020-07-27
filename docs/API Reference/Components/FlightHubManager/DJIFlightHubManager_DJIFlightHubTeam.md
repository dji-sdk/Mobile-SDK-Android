<div class="article"><h1 ><font color="#AAA">class </font>Team</h1></div>

~~~java
 final class Team 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">A team in DJI FlightHub. A group can contain several teams.



##### Class Members:

<div class="api-row" id="djiflighthubmanager_djiflighthubteam_teamid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubteam_teamid_inline">getTeamId</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubteam_teamid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTeamId</h6></div>

~~~java
 int getTeamId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets the ID of the team. Each team in a group will have a unique ID.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An Integer of team id.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubteam_groupid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubteam_groupid_inline">getGroupId</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubteam_groupid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGroupId</h6></div>

~~~java
 int getGroupId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets group's ID that current team belongs to.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An Integer of group id.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubteam_name"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubteam_name_inline">getName</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubteam_name_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets the team's name.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String of team name.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubteam_devices"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubteam_devices_inline">getDevices</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubteam_devices_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDevices</h6></div>

~~~java
 List<BoundDevice> getDevices() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Get devices of the team.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubBoundDevice.html#djiflighthubmanager_djiflighthubbounddevice">BoundDevice</a>&gt;</td><td><font color="#666"><i>A list of Devices that belongs to current team.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubteam_members"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubteam_members_inline">getMembers</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubteam_members_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMembers</h6></div>

~~~java
 List<User> getMembers() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets members of the team.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubUser.html#djiflighthubmanager_djiflighthubuser">User</a>&gt;</td><td><font color="#666"><i>A list of User.</i></td></tr></table></html></div>


