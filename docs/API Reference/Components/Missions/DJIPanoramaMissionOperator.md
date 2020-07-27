<div class="article"><h1 ><font color="#AAA">class </font>PanoramaMissionOperator</h1></div>

~~~java
 class PanoramaMissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The panorama mission operator is the only object that controls, runs and monitors Panorama Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>.



##### Class Members:

<div class="api-row" id="djipanoramamissionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 PanoramaMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_addlistenertoevents"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_addlistenertoevents_inline">addListener</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_addlistenertoevents_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull PanoramaMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Adds listener to receive all events of the Panorama mission operator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/PanoramaMissionOperatorListener.html#panoramamissionoperatorlistener">PanoramaMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>An interface of <code><a href="/Components/Missions/PanoramaMissionOperatorListener.html#panoramamissionoperatorlistener">PanoramaMissionOperatorListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull PanoramaMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. The listener will not receive any update after calling this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/PanoramaMissionOperatorListener.html#panoramamissionoperatorlistener">PanoramaMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners.

</div>

<div class="api-row" id="djipanoramamissionoperator_setupwithmode"><div class="api-col left">Setup Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_setupwithmode_inline">setup</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_setupwithmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setup</h6></div>

~~~java
 void setup(@NonNull PanoramaMode mode, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Sets up the Panorama mission with the specific mode. It can only be called  when the <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> is one of the  following:  <ul> <li><code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_readytosetup">READY_TO_SETUP</a></code> </li> <li><code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_readytoexecute">READY_TO_EXECUTE</a></code> </li> </ul> If the setup starts  successfully, <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_settingup">SETTING_UP</a></code>. Normally, it will take seconds to  complete the setup. Once setup is completed successfully,  <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_readytoexecute">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamission_djipanoramamode">PanoramaMode</a> <font color="#000">mode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamission_djipanoramamode">PanoramaMode</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute the mission that has been setup. <br> It can only be called when  the <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_readytoexecute">READY_TO_EXECUTE</a></code>. <br> If the mission is started successfully, the  <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
 void stopMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing mission. It can only be called when the  <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_executing">EXECUTING</a></code>. After a mission is stopped successfully,  <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_readytoexecute">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionoperator_getpanoramamediafile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionoperator_getpanoramamediafile_inline">getRecentPanoramaMediaFile</a></div></div><div class="inline-doc" id="djipanoramamissionoperator_getpanoramamediafile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRecentPanoramaMediaFile</h6></div>

~~~java
 void getRecentPanoramaMediaFile(@NonNull final CompletionCallbackWith<MediaFile> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Retrieves the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> object for the recently finished panorama  mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="panoramamissionoperatorlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/PanoramaMissionOperatorListener.html">PanoramaMissionOperatorListener</a></div></div><div class="api-row" id="djipanoramamissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIPanoramaMissionEvent.html">PanoramaMissionEvent</a></div></div><div class="api-row" id="djipanoramamissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIPanoramaMissionState.html">PanoramaMissionState</a></div></div><div class="api-row" id="djipanoramamission_djipanoramamissionstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIPanoramaMission_DJIPanoramaMissionStatus.html">PanoramaMissionExecutionState</a></div></div><div class="api-row" id="djipanoramamission_djipanoramamode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djipanoramamission_djipanoramamode_inline">PanoramaMode</a></div></div><div class="inline-doc" id="djipanoramamission_djipanoramamode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PanoramaMode</h6></div>

~~~java
@EXClassNullAway
 enum PanoramaMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">Defines options for different types of modes for Panorama mission.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djipanoramamission_djipanoramamode_fullcircle_inline"></a>FULL_CIRCLE</td><td><font color="#666">360 Degree Panorama mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipanoramamission_djipanoramamode_halfcircle_inline"></a>HALF_CIRCLE</td><td><font color="#666">180 Degree Panorama mode. Also known as selfie mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djipanoramamission_djipanoramamode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown mode.</td></tr></table></html>

##### Class Members:

</div>


