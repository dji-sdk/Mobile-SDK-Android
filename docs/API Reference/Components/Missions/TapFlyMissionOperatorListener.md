<div class="article"><h1 ><font color="#AAA">class </font>TapFlyMissionOperatorListener</h1></div>

~~~java
 interface TapFlyMissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Listener interface to receive events from the TapFly mission operator.



##### Class Members:



#### Callback method

<div class="api-row" id="tapflymissionoperatorlistener_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#tapflymissionoperatorlistener_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="tapflymissionoperatorlistener_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
    void onUpdate(@Nullable TapFlyMissionEvent aggregation)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Called when a new event has been updated.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent">TapFlyMissionEvent</a> <font color="#000">aggregation</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent">TapFlyMissionEvent</a></code>.</i></td></tr></table></html></div>


