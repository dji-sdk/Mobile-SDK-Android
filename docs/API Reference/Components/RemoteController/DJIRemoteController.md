<div class="article"><h1 ><font color="#AAA">class </font>RemoteController</h1></div>

~~~java
 class RemoteController extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents the remote controller of the aircraft. It provides methods to change the settings of the physical remote controller. For some products (e.g. Inspire 1 and Matrice 100), the class provides methods to manager the slave/master mode of the remote controllers. A remote controller is a device that can have a GPS, battery, radio, buttons, sticks, wheels, and output ports for video. The mobile device is connected to the remote controller, which is always sending out information about what everything is doing. The normal remote controller is called the master. A slave wirelessly connects to the master remote controller at 5 GHz, and the aircraft can also download information to the slave. The slave can send gimbal control commands to the master. This configuration allows one person to fly the aircraft while another person controls the gimbal. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> subclass off <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:



##### Related:

<div class="api-row" id="djiremotecontroller_djircgimbalmapping"><div class="api-col left">Master/Slave RC</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalMapping.html">GimbalMapping</a></div></div><div class="api-row" id="djiremotecontroller_djiremotecontrollermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollermode_inline">RCMode</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollermode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RCMode</h6></div>

~~~java
@EXClassNullAway
 enum RCMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_mode_key">RemoteControllerKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Controller mode of operation can be normal (single RC connected to aircraft), master, slave, or unknown.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollermode_master_inline"></a>MASTER</td><td><font color="#666">Remote Controller is a master (will route a connected slave Remote
 Controller's commands to the aircraft).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollermode_slave_inline"></a>SLAVE</td><td><font color="#666">Remote Controller is currently a slave Remote Controller (sends commands to aircraft through a master Remote Controller).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollermode_normal_inline"></a>NORMAL</td><td><font color="#666">Remote Controller is not connected to another Remote Controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollermode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The Remote Controller's mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djirccalibrationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirccalibrationstate_inline">CalibrationState</a></div></div><div class="inline-doc" id="djiremotecontroller_djirccalibrationstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CalibrationState</h6></div>

~~~java
@EXClassNullAway
 enum CalibrationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's calibration mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccalibrationstate_notcalibrating_inline"></a>NORMAL</td><td><font color="#666">There is currently no Remote Controller calibration happening.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccalibrationstate_recordingcenterposition_inline"></a>MIDDLE</td><td><font color="#666">Currently recording the joystick in its center position (joystick is untouched).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccalibrationstate_recordingextremepositions_inline"></a>LIMITS</td><td><font color="#666">Currently recording the extreme joystick positions, when joysticks are all the way  to their max in any direction (left, right, up, or down).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccalibrationstate_exit_inline"></a>QUIT</td><td><font color="#666">The Remote Controller is exiting calibration.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html">Information</a></div></div><div class="api-row" id="djiremotecontroller_djircjoinmasterresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircjoinmasterresult_inline">ConnectToMasterResult</a></div></div><div class="inline-doc" id="djiremotecontroller_djircjoinmasterresult_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ConnectToMasterResult</h6></div>

~~~java
@EXClassNullAway
 enum ConnectToMasterResult 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Result when a slave Remote Controller tries to join a master Remote Controller.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_successful_inline"></a>ACCEPTED</td><td><font color="#666">The slave Remote Controller's attempt to join the master Remote Controller was successful.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_passworderror_inline"></a>PASSWORD_ERROR</td><td><font color="#666">The slave Remote Controller's attempt to join the master Remote Controller was unsuccessful due to a password error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_rejected_inline"></a>REJECTED</td><td><font color="#666">The slave Remote Controller's attempt to join the master Remote Controller was rejected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_reachmaximum_inline"></a>MAXIMUM_CAPACITY</td><td><font color="#666">The slave Remote Controller's attempt to join the master Remote Controller was unsuccessful because the master  Remote Controller is at the maximum number of slaves it can have.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_timeout_inline"></a>TIMEOUT</td><td><font color="#666">The slave Remote Controller's attempt to join the master Remote Controller was unsuccessful because the request timed out.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircjoinmasterresult_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The result of the slave Remote Controller's attempt to join the master Remote Controller is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCMasterSlaveState.html">MasterSlaveState</a></div></div><div class="api-row" id="djiremotecontroller_djircgimbalcontrolspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalControlSpeed.html">GimbalControlSpeedCoefficient</a></div></div><div class="api-row" id="djiremotecontroller_djircrequestgimbalcontrolresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircrequestgimbalcontrolresult_inline">RequestGimbalControlResult</a></div></div><div class="inline-doc" id="djiremotecontroller_djircrequestgimbalcontrolresult_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RequestGimbalControlResult</h6></div>

~~~java
@EXClassNullAway
 enum RequestGimbalControlResult 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_request_gimbal_control_key">RemoteControllerKey.REQUEST_GIMBAL_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">Result when a slave Remote Controller requests permission to control the gimbal.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircrequestgimbalcontrolresult_agree_inline"></a>ACCEPTED</td><td><font color="#666">The master Remote Controller agrees to the slave's request.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircrequestgimbalcontrolresult_deny_inline"></a>REJECTED</td><td><font color="#666">The master Remote Controller denies the slave's request. If the  slave Remote Controller wants to control the gimbal, it must send  a request to the master Remote Controller first. Then the master  Remote Controller can decide to approve or deny the request.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircrequestgimbalcontrolresult_timeout_inline"></a>TIMEOUT</td><td><font color="#666">The slave Remote Controller's request timed out.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircrequestgimbalcontrolresult_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The slave Remote Controller's request is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_responseforgimbalcontrol"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_ResponseForGimbalControl.html">ResponseForGimbalControl</a></div></div><div class="api-row" id="djiremotecontroller_joinmasterauthorizationinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_JoinMasterAuthorizationInfo.html">AuthorizationInfo</a></div></div><div class="api-row" id="djiremotecontroller_djircgimbalmappingstyle"><div class="api-col left">State Updates - Master/Slave</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgimbalmappingstyle_inline">GimbalMappingStyle</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgimbalmappingstyle_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GimbalMappingStyle</h6></div>

~~~java
@EXClassNullAway
 enum GimbalMappingStyle 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gimbal_mapping_style_key">RemoteControllerKey.GIMBAL_MAPPING_STYLE</a></td></tr></table></html>



##### Description:



<font color="#666">The gimbal control stick mapping styles.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalmappingstyle_default_inline"></a>DEFAULT</td><td><font color="#666">Default</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalmappingstyle_custom_inline"></a>CUSTOM</td><td><font color="#666">Custom</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalmappingstyle_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircgimbalstickmapping"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalStickMapping.html">GimbalStickMapping</a></div></div><div class="api-row" id="djiremotecontroller_updategpsdatacallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_updateGpsDataCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiremotecontroller_mastersearchingcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_MasterSearchingCallbackInterface.html">MasterSearchingCallback</a></div></div><div class="api-row" id="djiremotecontroller_rtkchannelenabledupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html">RTKChannelEnabledUpdatedCallback</a></div></div><div class="api-row" id="djiremotecontroller_djirchardwarestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html">HardwareState</a></div></div><div class="api-row" id="djiremotecontroller_djircsecondaryvideooutputport"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircsecondaryvideooutputport_inline">SecondaryVideoOutputPort</a></div></div><div class="inline-doc" id="djiremotecontroller_djircsecondaryvideooutputport_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SecondaryVideoOutputPort</h6></div>

~~~java
@EXClassNullAway
 enum SecondaryVideoOutputPort 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller port to which to send secondary video (in addition to USB video sent to the Mobile Device).



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideooutputport_hdmi_inline"></a>HDMI</td><td><font color="#666">HDMI port.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideooutputport_sdi_inline"></a>SDI</td><td><font color="#666">SDI port.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideooutputport_unknown_inline"></a>Unknown</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircsecondaryvideodisplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircsecondaryvideodisplaymode_inline">SecondaryVideoDisplayMode</a></div></div><div class="inline-doc" id="djiremotecontroller_djircsecondaryvideodisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SecondaryVideoDisplayMode</h6></div>

~~~java
@EXClassNullAway
 enum SecondaryVideoDisplayMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Defines the combination of video sources to form the secondary output video. The secondary output can display  video streams from one or two input sources. When the encode mode is single: Source 1 represents video from  one of the Source1Only input ports (HDMI or AV). Source 2 represents video from EXT input port  (HD Gimbal Camera).  When the encode mode is dual: Source 1 represents video from HDMI input port.  Source 2 represents video from AV input port.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideodisplaymode_source1only_inline"></a>SOURCE_1_ONLY</td><td><font color="#666">Displays video from Source 1 only. When the current encode  mode is single, the secondary output will display  video from HDMI or AV input.  When the current encode mode is dual, the secondary output will display video from HDMI input.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideodisplaymode_source2only_inline"></a>SOURCE_2_ONLY</td><td><font color="#666">Displays video from Source 2 only. When the current encode mode is single, the secondary output  will display video from HD Gimbal camera. When the current encode mode is dual, the secondary output  will display video from  AV input.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideodisplaymode_pipsource1main_inline"></a>SOURCE_1_MAIN</td><td><font color="#666">Displays the video from Source 1 as the main subject, and the video from Source 2 in a mini  window (Picture in  Picture, or PIP).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideodisplaymode_pipsource2main_inline"></a>SOURCE_2_MAIN</td><td><font color="#666">Displays the video from Source 2 as the main subject, and the video from Source 1 in a mini window (Picture in  Picture, or PIP).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideodisplaymode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown output mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircsecondaryvideoosdunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircsecondaryvideoosdunit_inline">SecondaryVideoOSDUnit</a></div></div><div class="inline-doc" id="djiremotecontroller_djircsecondaryvideoosdunit_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SecondaryVideoOSDUnit</h6></div>

~~~java
@EXClassNullAway
 enum SecondaryVideoOSDUnit 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">OSD data units.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoosdunit_imperial_inline"></a>IMPERIAL</td><td><font color="#666">Imperial.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoosdunit_metric_inline"></a>METRIC</td><td><font color="#666">Metric.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoosdunit_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircsecondaryvideoformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircsecondaryvideoformat_inline">SecondaryVideoFormat</a></div></div><div class="inline-doc" id="djiremotecontroller_djircsecondaryvideoformat_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SecondaryVideoFormat</h6></div>

~~~java
@EXClassNullAway
 enum SecondaryVideoFormat 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Secondary output video resolution and frame rate.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080i60fps_inline"></a>RESOLUTION_1080I_60FPS</td><td><font color="#666">1080I 60FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080i50fps_inline"></a>RESOLUTION_1080I_50FPS</td><td><font color="#666">1080I 50FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080p60fps_inline"></a>RESOLUTION_1080P_60FPS</td><td><font color="#666">1080P 60FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080p50fps_inline"></a>RESOLUTION_1080P_50FPS</td><td><font color="#666">1080P 50FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080p30fps_inline"></a>RESOLUTION_1080P_30FPS</td><td><font color="#666">1080P 30FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080p25fps_inline"></a>RESOLUTION_1080P_25FPS</td><td><font color="#666">1080P 25FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_1080p24fps_inline"></a>RESOLUTION_1080P_24FPS</td><td><font color="#666">1080P 24FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_720p60fps_inline"></a>RESOLUTION_720P_60FPS</td><td><font color="#666">720P 60FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_720p50fps_inline"></a>RESOLUTION_720P_50FPS</td><td><font color="#666">720P 50FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_720p30fps_inline"></a>RESOLUTION_720P_30FPS</td><td><font color="#666">720P 30FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_720p25fps_inline"></a>RESOLUTION_720P_25FPS</td><td><font color="#666">720P 25FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_720p24fps_inline"></a>RESOLUTION_720P_24FPS</td><td><font color="#666">720P 24FPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsecondaryvideoformat_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircpipposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircpipposition_inline">PIPPosition</a></div></div><div class="inline-doc" id="djiremotecontroller_djircpipposition_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PIPPosition</h6></div>

~~~java
@EXClassNullAway
 enum PIPPosition 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">PIP (Picture In Picture) position on the screen relative to the main subject video.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpipposition_topleft_inline"></a>TOP_LEFT</td><td><font color="#666">PIP is on the screen's top left.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpipposition_topright_inline"></a>TOP_RIGHT</td><td><font color="#666">PIP is on the screen's top right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpipposition_bottomleft_inline"></a>BOTTOM_LEFT</td><td><font color="#666">PIP is on the screen's bottom left.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpipposition_bottomright_inline"></a>BOTTOM_RIGHT</td><td><font color="#666">PIP is on the screen's bottom right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpipposition_unknown_inline"></a>UNKNOWN</td><td><font color="#666">PIP is on the screen's bottom right.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircgpsdata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGPSData.html">GPSData</a></div></div><div class="api-row" id="djiremotecontroller_djircbatteryinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCBatteryInfo.html">BatteryState</a></div></div><div class="api-row" id="djiremotecontroller_djircremotefocusstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html">FocusControllerState</a></div></div><div class="api-row" id="djiremotecontroller_djirctoaircraftpairingstate"><div class="api-col left">Aircraft Pairing</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirctoaircraftpairingstate_inline">PairingState</a></div></div><div class="inline-doc" id="djiremotecontroller_djirctoaircraftpairingstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PairingState</h6></div>

~~~java
@EXClassNullAway
 enum PairingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_pairing_state_key">RemoteControllerKey.PAIRING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Controller pairing state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirctoaircraftpairingstate_notparing_inline"></a>UNPAIRED</td><td><font color="#666">The Remote Controller is not pairing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirctoaircraftpairingstate_paring_inline"></a>PAIRING</td><td><font color="#666">The Remote Controller is currently pairing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirctoaircraftpairingstate_completed_inline"></a>PAIRED</td><td><font color="#666">The Remote Controller's pairing was completed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirctoaircraftpairingstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The Remote Controller's pairing state is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircaircraftmapping"><div class="api-col left">Customize RC</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html">AircraftMapping</a></div></div><div class="api-row" id="djiremotecontroller_djircgimbalcontroldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgimbalcontroldirection_inline">GimbalAxis</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgimbalcontroldirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GimbalAxis</h6></div>

~~~java
@EXClassNullAway
 enum GimbalAxis 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">LEFT_WHEEL_GIMBAL_CONTROL_AXIS</td></tr></table></html>



##### Description:



<font color="#666">Defines what the Gimbal Dial (upper left dial on the Remote Controller) will control.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalcontroldirection_pitch_inline"></a>PITCH</td><td><font color="#666">The upper left dial will control the gimbal's pitch.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalcontroldirection_roll_inline"></a>ROLL</td><td><font color="#666">The upper left dial will control the gimbal's roll.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircgimbalcontroldirection_yaw_inline"></a>YAW</td><td><font color="#666">The upper left dial will control the gimbal's yaw.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_rccustombuttontagparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RCCustomButtonTagParam.html">CustomButtonTags</a></div></div><div class="api-row" id="djiremotecontroller_djiremotecontrollerchargemobilemode"><div class="api-col left">Mobile Device Charging</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerchargemobilemode_inline">ChargeMobileMode</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerchargemobilemode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ChargeMobileMode</h6></div>

~~~java
@EXClassNullAway
 enum ChargeMobileMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_charge_mobile_mode_key">RemoteControllerKey.CHARGE_MOBILE_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Modes to charge an iOS mobile device. Only supported by Inspire 2.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerchargemobilemode_never_inline"></a>NEVER</td><td><font color="#666">The remote controller does not charge the mobile device.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerchargemobilemode_always_inline"></a>ALWAYS</td><td><font color="#666">The remote controller charges the mobile device until the the mobile device is fully charged.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerchargemobilemode_intelligent_inline"></a>INTELLIGENT</td><td><font color="#666">The remote controller charges the mobile device in an intelligent mode: The remote controller starts charging  when the mobile device's battery is lowered then 20% and stops charging when the mobile device's battery is above 50%.  It is only supported by Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerchargemobilemode_unknown_inline"></a>Unknown</td><td><font color="#666">The Remote Controller's charging mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircbuttonaction"><div class="api-col left">Cendence Button Action</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircbuttonaction_inline">ButtonAction</a></div></div><div class="inline-doc" id="djiremotecontroller_djircbuttonaction_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ButtonAction</h6></div>

~~~java
 enum ButtonAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Actions that can be assigned to a customizable button. Some of the actions are reserved and the firmware will execute the corresponding actions even when the application is not connected. Some of the actions are defined by the mobile applications. The application is responsible for implementing the non firmware actions. The definitions used in DJI Go are provided. It is usually recommended to follow DJI Go's definitions for compability so if DJI Go is used at the same time as the SDK application the actions will be expected in both applications.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom0_inline"></a>CameraSetting</td><td><font color="#666">Toggle the camera setting view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_resetgimbal_inline"></a>GimbalCenter</td><td><font color="#666">Resets the gimbal attitude. The pitch and the yaw will point to the origin. It is supported  by the firmware of Matrice 200 series v2. For the other products, the action has to be implemented  by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom3_inline"></a>MapSwitch</td><td><font color="#666">Switch the live view and the map view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom4_inline"></a>ClearRoute</td><td><font color="#666">Clear the flight path in the map view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom5_inline"></a>Battery</td><td><font color="#666">Toggle the battery setting view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom7_inline"></a>CenterMetering</td><td><font color="#666">Trigger central exposure metering. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom8_inline"></a>AeLock</td><td><font color="#666">Toggles the AE Lock setting. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom9_inline"></a>ForeArm</td><td><font color="#666">Toggle the LEDs on the four arms. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_resetfpvgimbal_inline"></a>RESET_FPV_GIMBAL</td><td><font color="#666">Reset FPV gimbal attitude to the center, the gimbal will rotate 45 degrees in pitch axis up and  down when the action is trigger. It is supported by the firmware of Matrice 200 series and Matrice  200 V2 series. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom13_inline"></a>LiveViewExpand</td><td><font color="#666">Expand the live view from the FPV camera. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom14_inline"></a>QUICK_SPIN</td><td><font color="#666">Trigger a Quick Spin. It is supported by the firmware of Inspire 2. For the other products, the action has  to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom16_inline"></a>PlayBack</td><td><font color="#666">Toggle the playback view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_centerfocus_inline"></a>CenterFocus</td><td><font color="#666">Triggers focusing at the center of the live view. It is supported by the firmware of  Matrice 200 series v2. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom23_inline"></a>GetGimbalControl</td><td><font color="#666">Request gimbal control (for the slave remote controller). The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_togglegimbalmode_inline"></a>GimbalMode</td><td><font color="#666">Toggle <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_workmode_yawfollowmode">YAW_FOLLOW</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_workmode_freemode">FREE</a></code> for gimbal. It is  supported by the firmware of Matrice 200 series v2. For the other products, the action has to  be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom25_inline"></a>QuickSetting</td><td><font color="#666">Toggle the customizable button setting view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_togglefocus_inline"></a>AFMF</td><td><font color="#666">Toggle AF and MF for camera. It is supported by the firmware of Matrice 200 series v2. For the other products,  the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom27_inline"></a>CloseTips</td><td><font color="#666">Dismiss the warning tips. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom28_inline"></a>SmartGear</td><td><font color="#666">Toggle the automatic movement of the landing gear. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom29_inline"></a>ReviewWarning</td><td><font color="#666">Toggle the warning list view. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_switchfrequency_inline"></a>SWITCH_FREQUENCY</td><td><font color="#666">Switch frequency bands of the remote controller. It is supported by the firmware of Matrice 200 series.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom31_inline"></a>UpdateHomeDrone</td><td><font color="#666">Set the home location of the aircraft to the current location of the aircraft. The action has to be  implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom32_inline"></a>UpdateHomeRC</td><td><font color="#666">Set the home location of the aircraft to the current location of the remote controller. The action  has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_focus_inline"></a>Focus</td><td><font color="#666">Trigger the camera focus. It is supported by the firmware of Matrice 200 series and Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom41_inline"></a>CompositionMode</td><td><font color="#666">Toggle the composition mode for the Spotlight. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom43_inline"></a>FocusPeaking</td><td><font color="#666">Toggle the peak focus. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom44_inline"></a>GridLine</td><td><font color="#666">Toggle the display of grid. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom45_inline"></a>Histogram</td><td><font color="#666">Toggle the display of histogram. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom46_inline"></a>AEMFSwitch</td><td><font color="#666">Switch the white balance settings. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom47_inline"></a>OverExposure</td><td><font color="#666">Toggle the over-exposure warning. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom52_inline"></a>GIMBAL_YAW_RECENTER</td><td><font color="#666">Reset the gimbal yaw to align with the aircraft heading. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_togglelandinggear_inline"></a>TOGGLE_LANDING_GEAR</td><td><font color="#666">Retract or deploy the landing gear. It is supported by the firmware of Inspire 2. For the other products, the action  has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom59_inline"></a>CloseRadarMap</td><td><font color="#666">Toggle the radar map. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom60_inline"></a>CloseDownVPS</td><td><font color="#666">Toggle the downward vision sensors. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom61_inline"></a>CloseFrontAss</td><td><font color="#666">Toggle the forward obstacle avoidance. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom62_inline"></a>SwitchGimbalFpv</td><td><font color="#666">Switch the video source of the secondary video feeder between fpv and camera. The action has to be  implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom63_inline"></a>FullScreen</td><td><font color="#666">Toggle the full screen mode. The action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_zoomout_inline"></a>CUSTOM100</td><td><font color="#666">Zoom out. It is only supported by Z30 camera. It is supported by the firmware of Matrice  200 V2 series. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_zoomin_inline"></a>CUSTOM101</td><td><font color="#666">Zoom in. It is only supported by Z30 camera. It is supported by the firmware of Matrice 200 V2  series. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom102_inline"></a>CUSTOM102</td><td><font color="#666">Custom action with value 102. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom103_inline"></a>CUSTOM103</td><td><font color="#666">Toggle the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a></code>. It is only supported by XT2 camera. It is supported  by the firmware of Matrice 200 series v2. For the other products, the action has to be implemented  by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom104_inline"></a>CUSTOM104</td><td><font color="#666">Custom action with value 104. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom105_inline"></a>CUSTOM105</td><td><font color="#666">Custom action with value 105. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom106_inline"></a>CUSTOM106</td><td><font color="#666">Custom action with value 106. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom107_inline"></a>CUSTOM107</td><td><font color="#666">Custom action with value 107. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom108_inline"></a>CUSTOM108</td><td><font color="#666">Custom action with value 108. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom109_inline"></a>CUSTOM109</td><td><font color="#666">Custom action with value 109. This value is reserved for SDK applications.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_notdefined_inline"></a>NOT_DEFINED</td><td><font color="#666">Not defined. It is used to present that no action is bound to a button.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom150_inline"></a>CUSTOM150</td><td><font color="#666">Triggers the widget of the payload device in the index of 0. It is supported by the  firmware of Matrice 200 series v2. For the other products, the action has to be  implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom151_inline"></a>CUSTOM151</td><td><font color="#666">Triggers the widget of the payload device in the index of 1. It is supported by the  firmware of Matrice 200 series v2. For the other products, the action has to be  implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom152_inline"></a>CUSTOM152</td><td><font color="#666">Triggers the widget of the payload device in the index of 2. It is supported by the firmware  of Matrice 200 series v2. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom153_inline"></a>CUSTOM153</td><td><font color="#666">Triggers the widget of the payload device in the index of 3. It is supported by the firmware of Matrice 200 V2  series. For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom154_inline"></a>CUSTOM154</td><td><font color="#666">Triggers the widget of the payload device in the index of 4. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom155_inline"></a>CUSTOM155</td><td><font color="#666">Triggers the widget of the payload device in the index of 5. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom156_inline"></a>CUSTOM156</td><td><font color="#666">Triggers the widget of the payload device in the index of 6. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom157_inline"></a>CUSTOM157</td><td><font color="#666">Triggers the widget of the payload device in the index of 7. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom158_inline"></a>CUSTOM158</td><td><font color="#666">Triggers the widget of the payload device in the index of 8. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom159_inline"></a>CUSTOM159</td><td><font color="#666">Triggers the widget of the payload device in the index of 9. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom160_inline"></a>CUSTOM160</td><td><font color="#666">Triggers the widget of the payload device in the index of 10. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom161_inline"></a>CUSTOM161</td><td><font color="#666">Triggers the widget of the payload device in the index of 11. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom162_inline"></a>CUSTOM162</td><td><font color="#666">Triggers the widget of the payload device in the index of 12. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom163_inline"></a>CUSTOM163</td><td><font color="#666">Triggers the widget of the payload device in the index of 13. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircbuttonaction_custom164_inline"></a>CUSTOM164</td><td><font color="#666">Triggers the widget of the payload device in the index of 14. It is supported by the firmware of Matrice 200 series v2.  For the other products, the action has to be implemented by the application itself.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djirccustomizablebutton"><div class="api-col left">RC Customizable Button</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirccustomizablebutton_inline">CustomizableButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirccustomizablebutton_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CustomizableButton</h6></div>

~~~java
 enum CustomizableButton 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_fetch_customized_action_of_button_key">RemoteControllerKey.FETCH_CUSTOMIZED_ACTION_OF_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">The customizable buttons.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_c1_inline"></a>C1</td><td><font color="#666">The button with C1 label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_c2_inline"></a>C2</td><td><font color="#666">The button with C2 label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_c3_inline"></a>C3</td><td><font color="#666">The button with C3 label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_c4_inline"></a>C4</td><td><font color="#666">The button with C4 label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_ba_inline"></a>BA</td><td><font color="#666">The button with BA label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bb_inline"></a>BB</td><td><font color="#666">The button with BB label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bc_inline"></a>BC</td><td><font color="#666">The button with BC label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bd_inline"></a>BD</td><td><font color="#666">The button with BD label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_be_inline"></a>BE</td><td><font color="#666">The button with BE label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bf_inline"></a>BF</td><td><font color="#666">The button with BF label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bg_inline"></a>BG</td><td><font color="#666">The button with BG label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_bh_inline"></a>BH</td><td><font color="#666">The button with BH label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_td_inline"></a>TD</td><td><font color="#666">The button with TD label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_menu_inline"></a>Menu</td><td><font color="#666">The button with MENU label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_ls_inline"></a>LS</td><td><font color="#666">The button with LS label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_rs_inline"></a>RS</td><td><font color="#666">The button with RS label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_lw_inline"></a>LW</td><td><font color="#666">The button with LW label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_rw_inline"></a>RW</td><td><font color="#666">The button with RW label.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djirccustomizablebutton_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircpairingdevice"><div class="api-col left">RC Pairing Device</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircpairingdevice_inline">PairingDevice</a></div></div><div class="inline-doc" id="djiremotecontroller_djircpairingdevice_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PairingDevice</h6></div>

~~~java
 enum PairingDevice 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Types of the device that the remote controller can pair with. It is only used when the remote controller supports multi-device pairing. Only Supported by Phantom 4 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpairingdevice_aircraft_inline"></a>AIRCRAFT</td><td><font color="#666">The device to be paired with is an aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpairingdevice_rtkgroundsystem_inline"></a>RTK_BASE_STATION</td><td><font color="#666">The device to be paired with is an RTK base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircpairingdevice_unknown_inline"></a>UNKONWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircmultidevicestate"><div class="api-col left">Multi Device State</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmultidevicestate_inline">MultiDeviceState</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmultidevicestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MultiDeviceState</h6></div>

~~~java
 enum MultiDeviceState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The state (e.g. unpaired, paired, connected, etc.) of a device that may connected to the remote controller. It is only used when the remote controller supports multi-device pairing. Only supported by DJI Phantom 4 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_unpaired_inline"></a>UNPAIRED</td><td><font color="#666">The remote controller is unpaired with the device. This state is for both aircraft and base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_pairing_inline"></a>PAIRING</td><td><font color="#666">The remote controller is pairing with the device. This state is only for aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_paired_inline"></a>PAIRED</td><td><font color="#666">The remote controller is paired. This state is only for aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_disconnected_inline"></a>DISCONNECTED</td><td><font color="#666">The remote controller is paired with the device but the connection between the device  and the remote  controller is broken. The remote controller already remembers the device and the connection will receover  automatically when it is possible. This state is only for base station. Only Supported by Phantom 4 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_connected_inline"></a>CONNECTED</td><td><font color="#666">The remote controller is paired with the device and it is connected to the device.  This state is only for base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircmultidevicestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircsoftswitchjoystickmode"><div class="api-col left">soft Switch JoyStick Mode</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircsoftswitchjoystickmode_inline">SoftSwitchJoyStickMode</a></div></div><div class="inline-doc" id="djiremotecontroller_djircsoftswitchjoystickmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SoftSwitchJoyStickMode</h6></div>

~~~java
 enum SoftSwitchJoyStickMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Joy stick mode on the remote controller. It is only used when the remote controller doesn't have a mode switch. Only Supported by Mavic Mini.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsoftswitchjoystickmode_sport_inline"></a>SPORT</td><td><font color="#666">Set the joy stick to sport mode. Only Supported by Mavic Mini.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsoftswitchjoystickmode_position_inline"></a>POSITION</td><td><font color="#666">Set the joy stick to position mode. Only Supported by wMavic Mini.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsoftswitchjoystickmode_tripod_inline"></a>TRIPOD</td><td><font color="#666">Set the joy stick to tripod mode. Only Supported by Mavic Mini.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircsoftswitchjoystickmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_setsoftswitchjoystickmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsoftswitchjoystickmode_inline">setSoftSwitchJoyStickMode</a></div></div><div class="inline-doc" id="djiremotecontroller_setsoftswitchjoystickmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSoftSwitchJoyStickMode</h6></div>

~~~java
 void setSoftSwitchJoyStickMode(SoftSwitchJoyStickMode mode, CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the joy stick mode on the remote controller. It is only used when the remote controller doesn't have a mode switch. Only Supported by Mavic Mini.

</div>

<div class="api-row" id="djiremotecontroller_getsoftswitchjoystickmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsoftswitchjoystickmode_inline">getSoftSwitchJoyStickMode</a></div></div><div class="inline-doc" id="djiremotecontroller_getsoftswitchjoystickmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSoftSwitchJoyStickMode</h6></div>

~~~java
 void getSoftSwitchJoyStickMode(CommonCallbacks.CompletionCallbackWith<SoftSwitchJoyStickMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the joy stick mode on the remote controller. It is only used when the remote controller doesn't have a mode switch. Only Supported by Mavic Mini.

</div>

<div class="api-row" id="djiremotecontroller_joinedmasternameandpasswordresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_JoinedMasterNameAndPasswordResult.html">Credentials</a></div></div><div class="api-row" id="djiremotecontroller_professionalrc"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html">ProfessionalRC</a></div></div><div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicpro"><div class="api-col left">Display Name</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamemavicpro_inline">DisplayNameMavicPro</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicpro_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicPro</h6></div>

~~~java
 static final String DisplayNameMavicPro = DJIRCAbstraction.DisplayNameMavicPro
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Mavic Pro's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynameinspire1"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynameinspire1_inline">DisplayNameInspire1</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynameinspire1_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameInspire1</h6></div>

~~~java
 static final String DisplayNameInspire1 = DJIRCAbstraction.DisplayNameInspire1
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the remote controller for Inspire 1 series and Matrice 100.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamelightbridge2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamelightbridge2_inline">DisplayNameLightbridge2</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamelightbridge2_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameLightbridge2</h6></div>

~~~java
 static final String DisplayNameLightbridge2 = DJIRCAbstraction.DisplayNameLightbridge2
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the remote controller for Lightbridge 2 wireless module. The module is used by stand-alone Lightbridge 2, A3, N3 and Matrice 600 series.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynameinspire2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynameinspire2_inline">DisplayNameInspire2</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynameinspire2_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameInspire2</h6></div>

~~~java
 static final String DisplayNameInspire2 = DJIRCAbstraction.DisplayNameInspire2
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the remote controller for Inspire 2 and Matrice 200 series.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamecendence"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamecendence_inline">DisplayNameCendence</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamecendence_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameCendence</h6></div>

~~~java
 static final String DisplayNameCendence = DJIRCAbstraction.DisplayNameCendence
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the Cendence remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamecendencesdr"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamecendencesdr_inline">DisplayNameCendenceSDR</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamecendencesdr_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameCendenceSDR</h6></div>

~~~java
 static final String DisplayNameCendenceSDR = DJIRCAbstraction.DisplayNameCendenceSDR
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the Cendence SDR remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom3professinal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamephantom3professinal_inline">DisplayNamePhantom3Professinal</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom3professinal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom3Professinal</h6></div>

~~~java
 static final String DisplayNamePhantom3Professinal = DJIRCAbstraction.DisplayNamePhantom3Professinal
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the remote controller for Phantom 3 Professional, Phantom 3 Advanced and Phantom 4.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom3standard"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamephantom3standard_inline">DisplayNamePhantom3Standard</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom3standard_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom3Standard</h6></div>

~~~java
 static final String DisplayNamePhantom3Standard = DJIRCAbstraction.DisplayNamePhantom3Standard
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Phantom 3 Standard's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4pro"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamephantom4pro_inline">DisplayNamePhantom4Pro</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4pro_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom4Pro</h6></div>

~~~java
 static final String DisplayNamePhantom4Pro = DJIRCAbstraction.DisplayNamePhantom4Pro
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Phantom 4 Pro's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4advanced"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamephantom4advanced_inline">DisplayNamePhantom4Advanced</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4advanced_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom4Advanced</h6></div>

~~~java
 static final String DisplayNamePhantom4Advanced = DJIRCAbstraction.DisplayNamePhantom4Advanced
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Phantom 4 Advanced's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4prov2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamephantom4prov2_inline">DisplayNamePhantom4ProV2</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamephantom4prov2_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom4ProV2</h6></div>

~~~java
 static final String DisplayNamePhantom4ProV2 = DJIRCAbstraction.DisplayNamePhantom4ProV2
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of the remote controller for Phantom 4 Pro V2.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamespark"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamespark_inline">DisplayNameSpark</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamespark_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameSpark</h6></div>

~~~java
 static final String DisplayNameSpark = DJIRCAbstraction.DisplayNameSpark
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Spark's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicair"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamemavicair_inline">DisplayNameMavicAir</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicair_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicAir</h6></div>

~~~java
 static final String DisplayNameMavicAir = DJIRCAbstraction.DisplayNameMavicAir
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Mavic Air's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamemavic2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamemavic2_inline">DisplayNameMavic2</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamemavic2_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2</h6></div>

~~~java
 static final String DisplayNameMavic2 = DJIRCAbstraction.DisplayNameMavic2
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Mavic 2's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamemavic2enterprise"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamemavic2enterprise_inline">DisplayNameMavic2Enterprise</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamemavic2enterprise_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2Enterprise</h6></div>

~~~java
 static final String DisplayNameMavic2Enterprise = DJIRCAbstraction.DisplayNameMavic2Enterprise
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Mavic 2 Enterprise's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontroller"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontroller_inline">DisplayNameDJISmartController</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontroller_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameDJISmartController</h6></div>

~~~java
 static final String DisplayNameDJISmartController = DJIRCAbstraction.DisplayNameDJISmartController
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of DJI Smart Controller.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontrollerenterprisecontroller"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontrollerenterprisecontroller_inline">DisplayNameDJISmartControllerEnterpriseController</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamedjismartcontrollerenterprisecontroller_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameDJISmartControllerEnterpriseController</h6></div>

~~~java
 static final String DisplayNameDJISmartControllerEnterpriseController = DJIRCAbstraction.DisplayNamePM430Controller
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of DJI Smart Controller Enterprise.

</div>

<div class="api-row" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicmini"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerdisplaynamemavicmini_inline">DisplayNameMavicMini</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerdisplaynamemavicmini_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicMini</h6></div>

~~~java
 static final String DisplayNameMavicMini = DJIRCAbstraction.DisplayNameWM160
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The display name of Mavic Mini's remote controller.

</div>

<div class="api-row" id="djiremotecontroller_djircmultideviceaggregationstate"><div class="api-col left">Aggregation State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState.html">MultiDeviceAggregationState</a></div></div><html><p><br></p></html>

#### State Updates

<div class="api-row" id="djiremotecontroller_sethardwarestateupdatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_sethardwarestateupdatecallback_inline">setHardwareStateCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_sethardwarestateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHardwareStateCallback</h6></div>

~~~java
 void setHardwareStateCallback(@Nullable HardwareState.HardwareStateCallback hardwareStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Set the HardwareStateUpdateCallback



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable HardwareState.<a href="/Components/RemoteController/DJIRemoteController_RCHardwareStateUpdateCallbackInterface.html#djiremotecontroller_rchardwarestateupdatecallbackinterface">HardwareStateCallback</a> <font color="#000">hardwareStateCallback</td><td><font color="#666"><i>RCHardwareState.HardwareStateCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setbatterystateupdatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setbatterystateupdatecallback_inline">setChargeRemainingCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_setbatterystateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChargeRemainingCallback</h6></div>

~~~java
 void setChargeRemainingCallback(@Nullable BatteryState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the BatteryStateUpdateCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable BatteryState.Callback <font color="#000">callback</td><td><font color="#666"><i>ChargeRemaining.BatteryStateCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_updategpsdatacallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_updategpsdatacallback_inline">setGPSDataCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_updategpsdatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGPSDataCallback</h6></div>

~~~java
 void setGPSDataCallback(@Nullable GPSData.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Set the GPSDataUpdateCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCGPSData.html#djiremotecontroller_djircgpsdata">GPSData</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>GPSDataCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setprorceventcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setprorceventcallback_inline">setProRCEventCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_setprorceventcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setProRCEventCallback</h6></div>

~~~java
 void setProRCEventCallback(@Nullable ProfessionalRC.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Set the ProRCEventCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>ProfessionalRC callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_didupdatemasterslavestatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_didupdatemasterslavestatecallback_inline">setMasterSlaveStateCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_didupdatemasterslavestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMasterSlaveStateCallback</h6></div>

~~~java
 void setMasterSlaveStateCallback(@Nullable MasterSlaveState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback that updates the remote controller's state related to the master and slave mode. Only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCMasterSlaveState.html#djiremotecontroller_djircmasterslavestate">MasterSlaveState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>RCMasterSlaveStateUpdateCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setgimbalcontrolrequestfromslavereceivedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setgimbalcontrolrequestfromslavereceivedcallback_inline">setGimbalControlRequestFromSlaveCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_setgimbalcontrolrequestfromslavereceivedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalControlRequestFromSlaveCallback</h6></div>

~~~java
 void setGimbalControlRequestFromSlaveCallback(@Nullable Information.ControlRequestCallback controlRequestCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets GimbalControlRequestFromSlaveReceivedCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html#djiremotecontroller_djircinfo">Information</a>.<a href="/Components/RemoteController/DJIRemoteController_RCReceiveGimbalControlRequestFromSlaveCallbackInterface.html#djiremotecontroller_rcreceivegimbalcontrolrequestfromslavecallbackinterface">ControlRequestCallback</a> <font color="#000">controlRequestCallback</td><td><font color="#666"><i>Information.ControlRequestCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrcremotefocusstateupdatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrcremotefocusstateupdatecallback_inline">setFocusControllerStateCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_setrcremotefocusstateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusControllerStateCallback</h6></div>

~~~java
 void setFocusControllerStateCallback(@Nullable FocusControllerState.FocusControllerStateCallback focusStateUpdateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets RCRemoteFocusStateUpdateCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocusstate">FocusControllerState</a>.<a href="/Components/RemoteController/DJIRemoteController_RCRemoteFocusStateUpdateCallbackInterface.html#djiremotecontroller_rcremotefocusstateupdatecallbackinterface">FocusControllerStateCallback</a> <font color="#000">focusStateUpdateCallback</td><td><font color="#666"><i>FocusControllerState.FocusControllerStateCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_addrtkchannelenabledupdatedcallback"><div class="api-col left">Add Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_addrtkchannelenabledupdatedcallback_inline">addRTKChannelEnabledUpdatedCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_addrtkchannelenabledupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addRTKChannelEnabledUpdatedCallback</h6></div>

~~~java
 void addRTKChannelEnabledUpdatedCallback(@NonNull RTKChannelEnabledUpdatedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Add the RTKChannelEnabledUpdatedCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html#djiremotecontroller_rtkchannelenabledupdatedcallbackinterface">RTKChannelEnabledUpdatedCallback</a> <font color="#000">callback</td><td><font color="#666"><i><code><a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html#djiremotecontroller_rtkchannelenabledupdatedcallbackinterface">RTKChannelEnabledUpdatedCallback</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_addmultidevicespairingstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_addmultidevicespairingstatecallback_inline">addMultiDevicesPairingStateCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_addmultidevicespairingstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addMultiDevicesPairingStateCallback</h6></div>

~~~java
 void addMultiDevicesPairingStateCallback(@Nullable MultiDeviceAggregationState.Callback multiDeviceAggregationStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Adds <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState_callbackInterface.html#djiremotecontroller_djircmultideviceaggregationstate_callbackinterface">Callback</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState.html#djiremotecontroller_djircmultideviceaggregationstate">MultiDeviceAggregationState</a>.Callback <font color="#000">multiDeviceAggregationStateCallback</td><td><font color="#666"><i><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState.html#djiremotecontroller_djircmultideviceaggregationstate">MultiDeviceAggregationState</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_removertkchannelenabledupdatedcallback"><div class="api-col left">Remove Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_removertkchannelenabledupdatedcallback_inline">removeRTKChannelEnabledUpdatedCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_removertkchannelenabledupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeRTKChannelEnabledUpdatedCallback</h6></div>

~~~java
 void removeRTKChannelEnabledUpdatedCallback(@NonNull RTKChannelEnabledUpdatedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remove the <code><a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html#djiremotecontroller_rtkchannelenabledupdatedcallbackinterface">RTKChannelEnabledUpdatedCallback</a></code> callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html#djiremotecontroller_rtkchannelenabledupdatedcallbackinterface">RTKChannelEnabledUpdatedCallback</a> <font color="#000">callback</td><td><font color="#666"><i><code><a href="/Components/RemoteController/DJIRemoteController_RTKChannelEnabledUpdatedCallbackInterface.html#djiremotecontroller_rtkchannelenabledupdatedcallbackinterface">RTKChannelEnabledUpdatedCallback</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_removemultidevicespairingstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_removemultidevicespairingstatecallback_inline">removeMultiDevicesPairingStateCallback</a></div></div><div class="inline-doc" id="djiremotecontroller_removemultidevicespairingstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeMultiDevicesPairingStateCallback</h6></div>

~~~java
 void removeMultiDevicesPairingStateCallback(@Nullable MultiDeviceAggregationState.Callback multiDeviceAggregationStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Removes <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState_callbackInterface.html#djiremotecontroller_djircmultideviceaggregationstate_callbackinterface">Callback</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState.html#djiremotecontroller_djircmultideviceaggregationstate">MultiDeviceAggregationState</a>.Callback <font color="#000">multiDeviceAggregationStateCallback</td><td><font color="#666"><i><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState.html#djiremotecontroller_djircmultideviceaggregationstate">MultiDeviceAggregationState</a></code> callback.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Aircraft Pairing

<div class="api-row" id="djiremotecontroller_enterpairingmode"><div class="api-col left">Enter Pairing Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_enterpairingmode_inline">startPairing</a></div></div><div class="inline-doc" id="djiremotecontroller_enterpairingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startPairing</h6></div>

~~~java
 void startPairing(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_start_pairing_key">RemoteControllerKey.START_PAIRING</a></td></tr></table></html>



##### Description:



<font color="#666">Enters pairing mode, in which the Remote Controller starts pairing with the aircraft. This method is used when the Remote Controller no longer recognizes which aircraft it is paired with.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned. See <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_exitpairingmode"><div class="api-col left">Exit Pairing Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_exitpairingmode_inline">stopPairing</a></div></div><div class="inline-doc" id="djiremotecontroller_exitpairingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopPairing</h6></div>

~~~java
 void stopPairing(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_stop_pairing_key">RemoteControllerKey.STOP_PAIRING</a></td></tr></table></html>



##### Description:



<font color="#666">Exits pairing mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned. See <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getpairingstate"><div class="api-col left">Pairing State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getpairingstate_inline">getPairingState</a></div></div><div class="inline-doc" id="djiremotecontroller_getpairingstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPairingState</h6></div>

~~~java
 void getPairingState(@NonNull CompletionCallbackWith<PairingState> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_pairing_state_key">RemoteControllerKey.PAIRING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the pairing status as the Remote Controller is pairing with the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;PairingState&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Multi Device Pairing

<div class="api-row" id="djiremotecontroller_ismultidevicepairingsupported"><div class="api-col left">Pairing Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_ismultidevicepairingsupported_inline">isMultiDevicePairingSupported</a></div></div><div class="inline-doc" id="djiremotecontroller_ismultidevicepairingsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMultiDevicePairingSupported</h6></div>

~~~java
 boolean isMultiDevicePairingSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if multi-device pairing supported by the remote controller.  When the remote controller supports multi-device pairing, it can be  paired to more than one device (e.g. aircraft, RTK base station) at  the same time. When this feature is supported,  use <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_startmultidevicepairingwithtarget">startMultiDevicePairing</a></code>  and <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_stopmultidevicepairing">stopMultiDevicePairing</a></code> to start and stop  pairing instead of using the following methods: <br> - <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_enterpairingmode">startPairing</a></code>  <br> - <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_exitpairingmode">stopPairing</a></code> <br> - <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_getpairingstate">getPairingState</a></code>.  This feature is only supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if multi-device pairing is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_startmultidevicepairingwithtarget"><div class="api-col left">Start Pairing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_startmultidevicepairingwithtarget_inline">startMultiDevicePairing</a></div></div><div class="inline-doc" id="djiremotecontroller_startmultidevicepairingwithtarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMultiDevicePairing</h6></div>

~~~java
 void startMultiDevicePairing(PairingDevice target, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts pairing a target with the specific type (aircraft or RTK base station). This paring method  is for Phantom 4 RTK only. To use RTK feature with a base station, the Phantom 4 RTK remote controller  need to pair both the base station and the aircraft at the same time. <br> CAUTION: pairing an RTK  base station will unpair the paired aircraft. Therefore, to use the base station properly, the user  needs to pair the base station first, and the aircraft after. It is only supported  when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_ismultidevicepairingsupported">isMultiDevicePairingSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircpairingdevice">PairingDevice</a> <font color="#000">target</td><td><font color="#666"><i>The device target to start multi-device pairing.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_stopmultidevicepairing"><div class="api-col left">Stop Pairing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_stopmultidevicepairing_inline">stopMultiDevicePairing</a></div></div><div class="inline-doc" id="djiremotecontroller_stopmultidevicepairing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMultiDevicePairing</h6></div>

~~~java
 void stopMultiDevicePairing(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Stops the multi-device pairing. It is used after the pairing is started and before the remote controller  is paired to a device successfully. It is not necessary to call this method if the remote controller is  paired to a device successfully. Only Supported by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### RTK Channel

<div class="api-row" id="djiremotecontroller_setrtkchannelenabled"><div class="api-col left">Set Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrtkchannelenabled_inline">setRTKChannelEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setrtkchannelenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRTKChannelEnabled</h6></div>

~~~java
 void setRTKChannelEnabled(boolean enabled, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables the RTK channel on the remote controller. When RTK air system is using the base station as the  reference station, the remote controller should enable the RTK channel and reserve some bandwidth for data  transmission between the base station and the air system. <br> CAUTION: toggling RTK channel will reset  the airlink between the remote controller and the aircraft. The airlink may take 3 seconds to recover. DO  NOT enable/disable the channel when the aircraft is flying. Only Supported by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the RTK channel on the remote controller.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Customize RC

<div class="api-row" id="djiremotecontroller_setcustomaircraftmapping"><div class="api-col left">Flight Control Stick Mapping</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setcustomaircraftmapping_inline">setCustomAircraftMapping</a></div></div><div class="inline-doc" id="djiremotecontroller_setcustomaircraftmapping_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomAircraftMapping</h6></div>

~~~java
 void setCustomAircraftMapping(@NonNull AircraftMapping mapping, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_aircraft_custom_mapping_key">RemoteControllerKey.AIRCRAFT_CUSTOM_MAPPING</a></td></tr></table></html>



##### Description:



<font color="#666">Set the mapping of custom style. It will change the current mapping style to <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html#djiremotecontroller_djircaircraftmappingstyle_custom">STYLE_CUSTOM</a></code>. The setting will only take effect when the remote controller is in master mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html#djiremotecontroller_djircaircraftmapping">AircraftMapping</a> <font color="#000">mapping</td><td><font color="#666"><i>The remote controller aircraft mapping.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getcustomaircraftmapping"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getcustomaircraftmapping_inline">getCustomAircraftMapping</a></div></div><div class="inline-doc" id="djiremotecontroller_getcustomaircraftmapping_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomAircraftMapping</h6></div>

~~~java
 void getCustomAircraftMapping(@NonNull CompletionCallbackWith<AircraftMapping> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_aircraft_custom_mapping_key">RemoteControllerKey.AIRCRAFT_CUSTOM_MAPPING</a></td></tr></table></html>



##### Description:



<font color="#666">Retrieves the stick mapping associated with the custom style.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html#djiremotecontroller_djircaircraftmapping">AircraftMapping</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrccontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrccontrolmode_inline">setAircraftMappingStyle</a></div></div><div class="inline-doc" id="djiremotecontroller_setrccontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftMappingStyle</h6></div>

~~~java
 void setAircraftMappingStyle(@NonNull AircraftMappingStyle style, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_aircraft_mapping_style_key">RemoteControllerKey.AIRCRAFT_MAPPING_STYLE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html#djiremotecontroller_djircaircraftmappingstyle">AircraftMappingStyle</a> <font color="#000">style</td><td><font color="#666"><i>Remote controller control mode to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getrccontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getrccontrolmode_inline">getAircraftMappingStyle</a></div></div><div class="inline-doc" id="djiremotecontroller_getrccontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftMappingStyle</h6></div>

~~~java
 void getAircraftMappingStyle(@NonNull CompletionCallbackWith<AircraftMappingStyle> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_aircraft_mapping_style_key">RemoteControllerKey.AIRCRAFT_MAPPING_STYLE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCAircraftMapping.html#djiremotecontroller_djircaircraftmappingstyle">AircraftMappingStyle</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setcontrolgimbaldirection"><div class="api-col left">Gimbal Wheel</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setcontrolgimbaldirection_inline">setLeftDialGimbalControlAxis</a></div></div><div class="inline-doc" id="djiremotecontroller_setcontrolgimbaldirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLeftDialGimbalControlAxis</h6></div>

~~~java
 void setLeftDialGimbalControlAxis(@NonNull GimbalAxis axis,
                                                      @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">LEFT_WHEEL_GIMBAL_CONTROL_AXIS</td></tr></table></html>



##### Description:



<font color="#666">Sets which of the gimbal directions the top left dial (Gimbal Dial) on the Remote Controller will control. The three options (pitch, roll, and yaw) are outlined in the enum named <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircgimbalcontroldirection">GimbalAxis</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircgimbalcontroldirection">GimbalAxis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal direction to be set that the top left dial on the Remote Controller will control.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback. See <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getcontrolgimbaldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getcontrolgimbaldirection_inline">getLeftDialGimbalControlAxis</a></div></div><div class="inline-doc" id="djiremotecontroller_getcontrolgimbaldirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftDialGimbalControlAxis</h6></div>

~~~java
 void getLeftDialGimbalControlAxis(@NonNull CompletionCallbackWith<GimbalAxis> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">LEFT_WHEEL_GIMBAL_CONTROL_AXIS</td></tr></table></html>



##### Description:



<font color="#666">Gets which of the gimbal directions the top left wheel (Gimbal Dial) on the Remote Controller will control.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircgimbalcontroldirection">GimbalAxis</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setleftwheelgimbalcontrolspeedcoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setleftwheelgimbalcontrolspeedcoefficient_inline">setLeftDialGimbalControlSpeedCoefficient</a></div></div><div class="inline-doc" id="djiremotecontroller_setleftwheelgimbalcontrolspeedcoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLeftDialGimbalControlSpeedCoefficient</h6></div>

~~~java
 void setLeftDialGimbalControlSpeedCoefficient(int coefficient,
                                                                  @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets gimbal rotation speed of the top left wheel (Gimbal Dial) on the Remote Controller. The valid range is [0, 100].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">coefficient</td><td><font color="#666"><i>Gimbal control speed coefficient to be set. Setting it to zero can disable the gimbal control by the top left wheel.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getleftwheelgimbalcontrolspeedcoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getleftwheelgimbalcontrolspeedcoefficient_inline">getLeftDialGimbalControlSpeedCoefficient</a></div></div><div class="inline-doc" id="djiremotecontroller_getleftwheelgimbalcontrolspeedcoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftDialGimbalControlSpeedCoefficient</h6></div>

~~~java
 void getLeftDialGimbalControlSpeedCoefficient(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets gimbal rotation speed of the top left wheel (Gimbal Dial) on the Remote Controller. The valid range is [0, 100].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrccustombuttontag"><div class="api-col left">Custom Buttons</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrccustombuttontag_inline">setCustomButtonTags</a></div></div><div class="inline-doc" id="djiremotecontroller_setrccustombuttontag_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomButtonTags</h6></div>

~~~java
 void setCustomButtonTags(@NonNull CustomButtonTags tags, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_button_tags_key">RemoteControllerKey.CUSTOM_BUTTON_TAGS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets custom button tags, which can be used by the user to record user settings. Moreover, this method will make it easier for developers to set custom tags for buttons in the user interface, will make it easier to use the C1 and C2 buttons on the Remote Controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_RCCustomButtonTagParam.html#djiremotecontroller_rccustombuttontagparam">CustomButtonTags</a> <font color="#000">tags</td><td><font color="#666"><i>Back buttons' custom tags, the value should in the range of [0, 255].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getrccustombuttontag"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getrccustombuttontag_inline">getCustomButtonTags</a></div></div><div class="inline-doc" id="djiremotecontroller_getrccustombuttontag_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomButtonTags</h6></div>

~~~java
 void getCustomButtonTags(@NonNull CompletionCallbackWith<CustomButtonTags> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_button_tags_key">RemoteControllerKey.CUSTOM_BUTTON_TAGS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the custom button's (Back Button's) tags.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_RCCustomButtonTagParam.html#djiremotecontroller_rccustombuttontagparam">CustomButtonTags</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setshutterbuttonbindingenabled"><div class="api-col left">Shutter Button</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setshutterbuttonbindingenabled_inline">setShutterButtonBindingEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setshutterbuttonbindingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setShutterButtonBindingEnabled</h6></div>

~~~java
 void setShutterButtonBindingEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables invoking shooting photo interface when the shutter button is pressed. Mavic 2 series  remote controller's shutter button will not work physically when connecting to Mobile SDK.  This setting will be stored in software application localized storage paired with the RC SN key,  which means, if the application is killed, it will be set to enabled by default when the application  is relaunched. It is only supported by Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable invoking shooting photo interface when the shutter button is pressed.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getshutterbuttonbindingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getshutterbuttonbindingenabled_inline">getShutterButtonBindingEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_getshutterbuttonbindingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShutterButtonBindingEnabled</h6></div>

~~~java
 void getShutterButtonBindingEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets if shooting photo interface is involved when the shutter button is pressed. It is only supported by Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrecordbuttonbindingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrecordbuttonbindingenabled_inline">setRecordButtonBindingEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setrecordbuttonbindingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRecordButtonBindingEnabled</h6></div>

~~~java
 void setRecordButtonBindingEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables invoking video record interface when the record button is pressed. Mavic 2 series remote controller's record button  will not work physically when connecting to Mobile SDK. This setting will be stored in software application localized storage  paired with the RC SN key, which means, if the application is killed, it will be set to enabled by default when the application is  relaunched. It is only supported by Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable invoking video record interface when the record button is pressed.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getrecordbuttonbindingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getrecordbuttonbindingenabled_inline">getRecordButtonBindingEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_getrecordbuttonbindingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRecordButtonBindingEnabled</h6></div>

~~~java
 void getRecordButtonBindingEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets if video record interface is involved when the record button is pressed. It is only supported by Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Mobile Device Charging

<div class="api-row" id="djiremotecontroller_setchargemobilemode"><div class="api-col left">Charge Mobile Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setchargemobilemode_inline">setChargeMobileMode</a></div></div><div class="inline-doc" id="djiremotecontroller_setchargemobilemode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChargeMobileMode</h6></div>

~~~java
 void setChargeMobileMode(@NonNull ChargeMobileMode mode, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the charge mode of a connected iOS device.  Note: Android devices are always charging when connected to the remote controller. It is only supported by Inspire 2, M200 series, Cendence and Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollerchargemobilemode">ChargeMobileMode</a> <font color="#000">mode</td><td><font color="#666"><i>Charge Mobile mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getchargemobilemode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getchargemobilemode_inline">getChargeMobileMode</a></div></div><div class="inline-doc" id="djiremotecontroller_getchargemobilemode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeMobileMode</h6></div>

~~~java
 void getChargeMobileMode(@NonNull CompletionCallbackWith<ChargeMobileMode> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_charge_mobile_mode_key">RemoteControllerKey.CHARGE_MOBILE_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the mode to charge the connected iOS device. Note that Android devices are always charging when connected to the remote controller. It is only supported by Inspire 2, M200 series, Cendence, and Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollerchargemobilemode">ChargeMobileMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Master/Slave RC

<div class="api-row" id="djiremotecontroller_ismasterslavemodesupported"><div class="api-col left">Support</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_ismasterslavemodesupported_inline">isMasterSlaveModeSupported</a></div></div><div class="inline-doc" id="djiremotecontroller_ismasterslavemodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMasterSlaveModeSupported</h6></div>

~~~java
 boolean isMasterSlaveModeSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_is_master_slave_mode_supported_key">RemoteControllerKey.IS_MASTER_SLAVE_MODE_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Query method to check if the Remote Controller supports master/slave mode. Master-slave mode is supported by the Inspire 1, Inspire 1 Pro, Matrice 100, Lightbridge 2 (including Matrice 600, Matrice 600 Pro, A3 and N3) and Inspire 2. Inspire 2 is using a new set of interfaces to control the master and slave connection. <br> - Similar to other products, Inspire 2's remote controller also use set/get <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a></code> to change the mode. <br>- A slave remote controller can use <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_getmasters">getMasters</a></code> and <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_joinmasterwithidandauthenticationcode">connectToMaster</a></code> to join a master remote controller. <br>- A master remote controller can use <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_setmasterauthorizationcode">setMasterAuthorizationCode</a></code> to change the authentication code.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setremotecontrollermode"><div class="api-col left">Mode Selection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setremotecontrollermode_inline">setMode</a></div></div><div class="inline-doc" id="djiremotecontroller_setremotecontrollermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMode</h6></div>

~~~java
 void setMode(@NonNull RCMode mode, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_mode_key">RemoteControllerKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's mode. See the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a></code> enum for all possible Remote Controller modes. The master and slave modes are only supported for the Inspire 1, Inspire 1 Pro, M100, Lightbridge 2 (including Matrice 600, Matrice 600 Pro, A3 and N3) and Inspire 2. It's not supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a> <font color="#000">mode</td><td><font color="#666"><i>Mode of type <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a></code> to be set for the Remote Controller.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getremotecontrollermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getremotecontrollermode_inline">getMode</a></div></div><div class="inline-doc" id="djiremotecontroller_getremotecontrollermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 void getMode(@NonNull CompletionCallbackWith<RCMode> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_mode_key">RemoteControllerKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's work mode. It is supported by the Inspire 1, Inspire 1 Pro, Matrice 100, Lightbridge 2 (including Matrice 600, Matrice 600 Pro, A3 and N3) and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrcname"><div class="api-col left">Identifier</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrcname_inline">setName</a></div></div><div class="inline-doc" id="djiremotecontroller_setrcname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setName</h6></div>

~~~java
 void setName(@NonNull String name, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_name_key">RemoteControllerKey.NAME</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's name.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">name</td><td><font color="#666"><i>Remote controller name to be set. Six characters at most.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getrcname"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getrcname_inline">getName</a></div></div><div class="inline-doc" id="djiremotecontroller_getrcname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 void getName(@NonNull CompletionCallbackWith<String> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_name_key">RemoteControllerKey.NAME</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's name.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setrcpassword"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setrcpassword_inline">setPassword</a></div></div><div class="inline-doc" id="djiremotecontroller_setrcpassword_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPassword</h6></div>

~~~java
 void setPassword(@NonNull String password, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_password_key">RemoteControllerKey.PASSWORD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's password.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">password</td><td><font color="#666"><i>Remote controller password to be set, using a string consisted by 4 digits.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned. See <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended to be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getrcpassword"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getrcpassword_inline">getPassword</a></div></div><div class="inline-doc" id="djiremotecontroller_getrcpassword_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPassword</h6></div>

~~~java
 void getPassword(@NonNull CompletionCallbackWith<String> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_password_key">RemoteControllerKey.PASSWORD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's password.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getslaverclist"><div class="api-col left">Connection - Master</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getslaverclist_inline">getSlaveList</a></div></div><div class="inline-doc" id="djiremotecontroller_getslaverclist_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSlaveList</h6></div>

~~~java
 void getSlaveList(@NonNull CompletionCallbackWith<Information[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_slave_list_key">RemoteControllerKey.SLAVE_LIST</a></td></tr></table></html>



##### Description:



<font color="#666">Used by the current master Remote Controller to get all the slaves connected to it.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html#djiremotecontroller_djircinfo">Information</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_startmasterrcsearch"><div class="api-col left">Connection - Slave</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_startmasterrcsearch_inline">startMasterSearching</a></div></div><div class="inline-doc" id="djiremotecontroller_startmasterrcsearch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMasterSearching</h6></div>

~~~java
 void startMasterSearching(@NonNull MasterSearchingCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_start_search_master_key">RemoteControllerKey.START_SEARCH_MASTER</a></td></tr></table></html>



##### Description:



<font color="#666">Starts a search by slave Remote Controller for nearby master Remote Controllers. To get the list of master Remote Controllers, first call <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_getavailablemastersrcs">getAvailableMasters</a></code>, then call <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_stopmasterrcsearch">stopMasterSearching</a></code> to end the search.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_MasterSearchingCallbackInterface.html#djiremotecontroller_mastersearchingcallbackinterface">MasterSearchingCallback</a> <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback. Please refer to <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_stopmasterrcsearch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_stopmasterrcsearch_inline">stopMasterSearching</a></div></div><div class="inline-doc" id="djiremotecontroller_stopmasterrcsearch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMasterSearching</h6></div>

~~~java
 void stopMasterSearching(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_stop_master_searching_key">RemoteControllerKey.STOP_MASTER_SEARCHING</a></td></tr></table></html>



##### Description:



<font color="#666">Used by a slave Remote Controller to stop the search for nearby master Remote Controllers.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback. Please refer to <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getavailablemastersrcs"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getavailablemastersrcs_inline">getAvailableMasters</a></div></div><div class="inline-doc" id="djiremotecontroller_getavailablemastersrcs_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAvailableMasters</h6></div>

~~~java
 void getAvailableMasters(@NonNull CompletionCallbackWith<Information[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_available_masters_key">RemoteControllerKey.AVAILABLE_MASTERS</a></td></tr></table></html>



##### Description:



<font color="#666">Starts search by slave Remote Controller for nearby master Remote Controllers. To get the list of master Remote Controllers use getAvailableMastersWithCallbackBlock then call stopMasterRCSearch to end th search.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html#djiremotecontroller_djircinfo">Information</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned. The array of masters contains objects of type Information.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getmasterrcsearchstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getmasterrcsearchstate_inline">getMasterSearchingState</a></div></div><div class="inline-doc" id="djiremotecontroller_getmasterrcsearchstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMasterSearchingState</h6></div>

~~~java
 void getMasterSearchingState(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_searching_state_key">RemoteControllerKey.MASTER_SEARCHING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the state of the master Remote Controller search. The search is initiated by the Mobile Device, but performed by the Remote Controller. Therefore, if the Mobile Device's application crashes while a search is ongoing, this method can be used to let the new instance of the application understand the Remote Controller state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_joinmasterrc"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterrc_inline">connectToMaster</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterrc_inline"

><div class="article"><h6 ><font color="#AAA">method </font>connectToMaster</h6></div>

~~~java
 void connectToMaster(@NonNull Credentials credentials,
                                         @Nullable
                                             CompletionCallbackWith<ConnectToMasterResult> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_connect_to_master_key">RemoteControllerKey.CONNECT_TO_MASTER</a></td></tr></table></html>



##### Description:



<font color="#666">Used by a slave Remote Controller to request to join a master Remote Controller and be able to control the gimbal. If the master Remote Controller accepts the request, the master Remote Controller will control the aircraft and the slave Remote Controller will control the gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_JoinedMasterNameAndPasswordResult.html#djiremotecontroller_joinedmasternameandpasswordresult">Credentials</a> <font color="#000">credentials</td><td><font color="#666"><i>Include master's name and master's password.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable                                              CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircjoinmasterresult">ConnectToMasterResult</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getjoinedmasterrcinfos"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getjoinedmasterrcinfos_inline">getConnectedMasterCredentials</a></div></div><div class="inline-doc" id="djiremotecontroller_getjoinedmasterrcinfos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getConnectedMasterCredentials</h6></div>

~~~java
 void getConnectedMasterCredentials(@NonNull CompletionCallbackWith<Credentials> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_connected_master_credentials_key">RemoteControllerKey.CONNECTED_MASTER_CREDENTIALS</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the master Remote Controller's information, which includes the unique identifier, name, and password.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_JoinedMasterNameAndPasswordResult.html#djiremotecontroller_joinedmasternameandpasswordresult">Credentials</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setmasterauthorizationcode"><div class="api-col left">Inspire 2 Connection - Master</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setmasterauthorizationcode_inline">setMasterAuthorizationCode</a></div></div><div class="inline-doc" id="djiremotecontroller_setmasterauthorizationcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMasterAuthorizationCode</h6></div>

~~~java
 void setMasterAuthorizationCode(@NonNull String authorizationCode, @Nullable
        CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_set_master_auth_code_key">RemoteControllerKey.SET_MASTER_AUTH_CODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the authorization code of a master remote controller. The slave remote controller needs to know the authorization code in order to join the master. A valid input is a string with 6 digits. The default value is "888888". It can only be called when the remote controller is in master mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">authorizationCode</td><td><font color="#666"><i>Authorization code to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable         CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getmasters"><div class="api-col left">Inspire 2 Connection - Slave</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getmasters_inline">getMasters</a></div></div><div class="inline-doc" id="djiremotecontroller_getmasters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMasters</h6></div>

~~~java
 void getMasters(@NonNull CompletionCallbackWith<String[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_list_key">RemoteControllerKey.MASTER_LIST</a></td></tr></table></html>



##### Description:



<font color="#666">Gets a list of the nearby remote controllers in master mode. It can only be called when the remote controller is in slave mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_joinmasterwithidandauthenticationcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterwithidandauthenticationcode_inline">connectToMaster</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterwithidandauthenticationcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>connectToMaster</h6></div>

~~~java
 void connectToMaster(@NonNull AuthorizationInfo info, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_connect_to_master_with_id_key">RemoteControllerKey.CONNECT_TO_MASTER_WITH_ID</a></td></tr></table></html>



##### Description:



<font color="#666">Joins the master remote controller with the specific ID. If the remote controller has joined the same master before, the authorization code is not required until the master remote controller changes its authorization code. In this case, <code>code</code> can be <code>null</code>. It can only be called when the remote controller is in slave mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_JoinMasterAuthorizationInfo.html#djiremotecontroller_joinmasterauthorizationinfo">AuthorizationInfo</a> <font color="#000">info</td><td><font color="#666"><i>JoinMasterData object.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_requestgimbalcontrol"><div class="api-col left">Request Gimbal Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_requestgimbalcontrol_inline">requestGimbalControl</a></div></div><div class="inline-doc" id="djiremotecontroller_requestgimbalcontrol_inline"

><div class="article"><h6 ><font color="#AAA">method </font>requestGimbalControl</h6></div>

~~~java
 void requestGimbalControl(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Requests the gimbal control from the other remote controller. Different  from <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_requestgimbalcontrolright">requestLegacyGimbalControl</a></code>, the gimbal control  permission is transferred to the remote controller without the reply from  the master remote controller. The master remote controller can attain the  gimbal control back by calling the same method. It is only supported by  Inspire 2, M200 series and Cendence.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_responserequester"><div class="api-col left">Gimbal Control - Master</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_responserequester_inline">respondToRequestForGimbalControl</a></div></div><div class="inline-doc" id="djiremotecontroller_responserequester_inline"

><div class="article"><h6 ><font color="#AAA">method </font>respondToRequestForGimbalControl</h6></div>

~~~java
 void respondToRequestForGimbalControl(ResponseForGimbalControl response)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_response_to_request_for_gimbal_control_key">RemoteControllerKey.RESPONSE_TO_REQUEST_FOR_GIMBAL_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">When a slave Remote Controller requests a master Remote Controller to control the gimbal, this method is used by a master Remote Controller to respond to the slave Remote Controller's request.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_ResponseForGimbalControl.html#djiremotecontroller_responseforgimbalcontrol">ResponseForGimbalControl</a> <font color="#000">response</td><td><font color="#666"><i>The response object of ResponseForGimbalControl to the slave Remote Controller.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_requestgimbalcontrolright"><div class="api-col left">Gimbal Control - Slave</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_requestgimbalcontrolright_inline">requestLegacyGimbalControl</a></div></div><div class="inline-doc" id="djiremotecontroller_requestgimbalcontrolright_inline"

><div class="article"><h6 ><font color="#AAA">method </font>requestLegacyGimbalControl</h6></div>

~~~java
 void requestLegacyGimbalControl(@NonNull CompletionCallbackWith<RequestGimbalControlResult> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Called by the slave Remote Controller to request gimbal control from the master Remote Controller. It is only supported by Inspire 1 and DJI Lightbridge 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircrequestgimbalcontrolresult">RequestGimbalControlResult</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setslavecontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setslavecontrolmode_inline">setGimbalMappingStyle</a></div></div><div class="inline-doc" id="djiremotecontroller_setslavecontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalMappingStyle</h6></div>

~~~java
 void setGimbalMappingStyle(@NonNull GimbalMappingStyle style, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gimbal_mapping_style_key">RemoteControllerKey.GIMBAL_MAPPING_STYLE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's slave control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircgimbalmappingstyle">GimbalMappingStyle</a> <font color="#000">style</td><td><font color="#666"><i>Control mode to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getslavecontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getslavecontrolmode_inline">getGimbalMappingStyle</a></div></div><div class="inline-doc" id="djiremotecontroller_getslavecontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGimbalMappingStyle</h6></div>

~~~java
 void getGimbalMappingStyle(@NonNull CompletionCallbackWith<GimbalMappingStyle> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gimbal_mapping_style_key">RemoteControllerKey.GIMBAL_MAPPING_STYLE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's slave control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircgimbalmappingstyle">GimbalMappingStyle</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setslavejoystickcontrolgimbalspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setslavejoystickcontrolgimbalspeed_inline">setGimbalControlSpeedCoefficient</a></div></div><div class="inline-doc" id="djiremotecontroller_setslavejoystickcontrolgimbalspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalControlSpeedCoefficient</h6></div>

~~~java
 void setGimbalControlSpeedCoefficient(@NonNull GimbalControlSpeedCoefficient speedCoefficient,
                                                          @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gimbal_control_speed_coefficient_key">RemoteControllerKey.GIMBAL_CONTROL_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Called by the slave Remote Controller to set the gimbal's pitch, roll, and yaw speed with a range of [0, 100].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalControlSpeed.html#djiremotecontroller_djircgimbalcontrolspeed">GimbalControlSpeedCoefficient</a> <font color="#000">speedCoefficient</td><td><font color="#666"><i>Speed to be set for gimbal's pitch, roll, and yaw, which should be in the range of [0, 100].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback. See <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code> for more information about the callback and what is recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getslavejoystickcontrolgimbalspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getslavejoystickcontrolgimbalspeed_inline">getGimbalControlSpeedCoefficient</a></div></div><div class="inline-doc" id="djiremotecontroller_getslavejoystickcontrolgimbalspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGimbalControlSpeedCoefficient</h6></div>

~~~java
 void getGimbalControlSpeedCoefficient(@NonNull CompletionCallbackWith<GimbalControlSpeedCoefficient> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gimbal_control_speed_coefficient_key">RemoteControllerKey.GIMBAL_CONTROL_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the current slave's gimbal's pitch, roll, and yaw speed with a range of [0, 100].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalControlSpeed.html#djiremotecontroller_djircgimbalcontrolspeed">GimbalControlSpeedCoefficient</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setcustomgimbalmapping"><div class="api-col left">Custom Gimbal Mapping</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setcustomgimbalmapping_inline">setCustomGimbalMapping</a></div></div><div class="inline-doc" id="djiremotecontroller_setcustomgimbalmapping_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomGimbalMapping</h6></div>

~~~java
 void setCustomGimbalMapping(@NonNull GimbalMapping mapping, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_gimbal_mapping_key">RemoteControllerKey.CUSTOM_GIMBAL_MAPPING</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller's slave control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalMapping.html#djiremotecontroller_djircgimbalmapping">GimbalMapping</a> <font color="#000">mapping</td><td><font color="#666"><i>The DJIRCGimbalMapping object.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getcustomgimbalmapping"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getcustomgimbalmapping_inline">getCustomGimbalMapping</a></div></div><div class="inline-doc" id="djiremotecontroller_getcustomgimbalmapping_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomGimbalMapping</h6></div>

~~~java
 void getCustomGimbalMapping(@NonNull CompletionCallbackWith<GimbalMapping> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_gimbal_mapping_key">RemoteControllerKey.CUSTOM_GIMBAL_MAPPING</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller's slave control mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_DJIRCGimbalMapping.html#djiremotecontroller_djircgimbalmapping">GimbalMapping</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Cendence Custom Buttons

<div class="api-row" id="djiremotecontroller_iscustomizablebuttonsupported"><div class="api-col left">Check Support</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_iscustomizablebuttonsupported_inline">isCustomizableButtonSupported</a></div></div><div class="inline-doc" id="djiremotecontroller_iscustomizablebuttonsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCustomizableButtonSupported</h6></div>

~~~java
 boolean isCustomizableButtonSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the remote controller supports customizable buttons. With the customizable buttons, the user can define the action bound to a button. When the button is clicked, the corresponding action can be received from the .
  Only Cendence supports customizable buttons. This is distinct from remote
  controllers with buttons C1 and C2 that support custom tags and a binding to DJI Go.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>TRUE to support customizable button.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getbuttonprofilegroups"><div class="api-col left">Button Profile Group</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getbuttonprofilegroups_inline">getButtonProfileGroups</a></div></div><div class="inline-doc" id="djiremotecontroller_getbuttonprofilegroups_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getButtonProfileGroups</h6></div>

~~~java
 void getButtonProfileGroups(final CommonCallbacks.CompletionCallbackWith<String[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the names of the customizable button profile groups. The configurations of the customizable buttons are organized as groups. The maximum number of groups is 5 and each group contains 3 profiles. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_addbuttonprofilegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_addbuttonprofilegroup_inline">addButtonProfileGroup</a></div></div><div class="inline-doc" id="djiremotecontroller_addbuttonprofilegroup_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addButtonProfileGroup</h6></div>

~~~java
 void addButtonProfileGroup(String groupName, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Adds a group of customizable button profiles. Three default profiles will be created for the newly added group. The default profile can accessed through <code><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC_ButtonConfiguration.html#djiremotecontroller_professionalrc_getbuttonactions">getButtonActions</a></code>. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">groupName</td><td><font color="#666"><i>The name of the group to be added.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_removebuttonprofilegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_removebuttonprofilegroup_inline">removeButtonProfileGroup</a></div></div><div class="inline-doc" id="djiremotecontroller_removebuttonprofilegroup_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeButtonProfileGroup</h6></div>

~~~java
 void removeButtonProfileGroup(String groupName, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Removes a group from the customizable button profiles. There must be at least one group, therefore, the removal of the last group will fail. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">groupName</td><td><font color="#666"><i>The name of the group to be removed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_renamebuttonprofilegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_renamebuttonprofilegroup_inline">renameButtonProfileGroup</a></div></div><div class="inline-doc" id="djiremotecontroller_renamebuttonprofilegroup_inline"

><div class="article"><h6 ><font color="#AAA">method </font>renameButtonProfileGroup</h6></div>

~~~java
 void renameButtonProfileGroup(String oldProfileName,
                                         String newProfileName,
                                         @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Renames a profile group to a new name. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">oldProfileName</td><td><font color="#666"><i>The name of the group to be renamed.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">newProfileName</td><td><font color="#666"><i>The new profile group name.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_selectbuttonprofilegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_selectbuttonprofilegroup_inline">selectButtonProfileGroup</a></div></div><div class="inline-doc" id="djiremotecontroller_selectbuttonprofilegroup_inline"

><div class="article"><h6 ><font color="#AAA">method </font>selectButtonProfileGroup</h6></div>

~~~java
 void selectButtonProfileGroup(String groupName, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Selects the customizable button profile group. The profile with 0 configIndex in the group will be applied. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">groupName</td><td><font color="#666"><i>The name of the group to select.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getselectedbuttonprofilegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getselectedbuttonprofilegroup_inline">getSelectedButtonProfileGroup</a></div></div><div class="inline-doc" id="djiremotecontroller_getselectedbuttonprofilegroup_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelectedButtonProfileGroup</h6></div>

~~~java
 void getSelectedButtonProfileGroup(final CommonCallbacks.CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the name of the selected customizable button profile group. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_selectbuttonprofile"><div class="api-col left">Button Profile</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_selectbuttonprofile_inline">selectButtonProfile</a></div></div><div class="inline-doc" id="djiremotecontroller_selectbuttonprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>selectButtonProfile</h6></div>

~~~java
 void selectButtonProfile(int profileIndex, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Selects the customizable button profile with the specific index in the selected profile group. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">profileIndex</td><td><font color="#666"><i>The index of the profile to select. The valid range is [0, 2].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getselectedbuttonprofile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getselectedbuttonprofile_inline">getSelectedButtonProfile</a></div></div><div class="inline-doc" id="djiremotecontroller_getselectedbuttonprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelectedButtonProfile</h6></div>

~~~java
 void getSelectedButtonProfile(final CommonCallbacks.CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the index of the selected button profile in the selected group. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setbuttonconfig"><div class="api-col left">Button Config</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setbuttonconfig_inline">setButtonConfig</a></div></div><div class="inline-doc" id="djiremotecontroller_setbuttonconfig_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setButtonConfig</h6></div>

~~~java
 void setButtonConfig(ProfessionalRC.ButtonConfiguration config, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Customizes the button configuration. The configuration will be applied to the remote controller immediately and will be stored into the selected profile of the selected profile group. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>. Supported by the Cendence remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC_ButtonConfiguration.html#djiremotecontroller_professionalrc_buttonconfiguration">ButtonConfiguration</a> <font color="#000">config</td><td><font color="#666"><i>The configuration to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getbuttonconfig"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getbuttonconfig_inline">getButtonConfig</a></div></div><div class="inline-doc" id="djiremotecontroller_getbuttonconfig_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getButtonConfig</h6></div>

~~~java
 void getButtonConfig(final CommonCallbacks.CompletionCallbackWith<ProfessionalRC.ButtonConfiguration> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the button configuration being applied to the remote controller. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>. Supported by the  Cendence remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC_ButtonConfiguration.html#djiremotecontroller_professionalrc_buttonconfiguration">ButtonConfiguration</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_resetbuttonconfig"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_resetbuttonconfig_inline">resetButtonConfig</a></div></div><div class="inline-doc" id="djiremotecontroller_resetbuttonconfig_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetButtonConfig</h6></div>

~~~java
 void resetButtonConfig(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Resets the selected button configuration to the default settings. The default configuration will be applied to the remote controller and will be stored into the selected index of the activated user. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_customizebutton"><div class="api-col left">Customize Button</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_customizebutton_inline">customizeButton</a></div></div><div class="inline-doc" id="djiremotecontroller_customizebutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>customizeButton</h6></div>

~~~java
 void customizeButton(ProfessionalRC.CustomizableButton button, ProfessionalRC.ButtonAction action, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Customizes the action of a button. The new setting will be applied to the remote controller and will be stored into the selected profile index of the selected profile group. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djirccustomizablebutton">CustomizableButton</a> <font color="#000">button</td><td><font color="#666"><i>The customizable button.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircbuttonaction">ButtonAction</a> <font color="#000">action</td><td><font color="#666"><i>The action to be bound to the button.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_fetchcustomizedactionofbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_fetchcustomizedactionofbutton_inline">fetchCustomizedActionOfButton</a></div></div><div class="inline-doc" id="djiremotecontroller_fetchcustomizedactionofbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchCustomizedActionOfButton</h6></div>

~~~java
 void fetchCustomizedActionOfButton(ProfessionalRC.CustomizableButton button, @Nullable final CommonCallbacks.CompletionCallbackWith<ProfessionalRC.ButtonAction> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Fetches the customized action of a button in the selected configuration. It is only valid when <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_iscustomizablebuttonsupported">isCustomizableButtonSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djirccustomizablebutton">CustomizableButton</a> <font color="#000">button</td><td><font color="#666"><i>The customizable button.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController_ProfessionalRC.html#djiremotecontroller_professionalrc">ProfessionalRC</a>.<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircbuttonaction">ButtonAction</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### RC Commands

<div class="api-row" id="djiremotecontroller_setcontrollinggimbalindex"><div class="api-col left">Controlling Gimbal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setcontrollinggimbalindex_inline">setControllingGimbalIndex</a></div></div><div class="inline-doc" id="djiremotecontroller_setcontrollinggimbalindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllingGimbalIndex</h6></div>

~~~java
 void setControllingGimbalIndex(int index, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Directs commands of the physical buttons on the remote controller (rotating gimbal, shoot photo, record video, etc.) to the specific gimbal, when there are multiple gimbals connected. If there is only one gimbal connected, this setting is reset to the remaining gimbal. Enabling <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setattitudesynchronizationenabled">setAttitudeSynchronizationEnabled</a></code> will reset this setting to index 0 and when <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setattitudesynchronizationenabled">setAttitudeSynchronizationEnabled</a></code> is enabled, index can only be set to 0. It is only supported by M210 and M210 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of the gimbal to receive the remote controller commands.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getcontrollinggimbalindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getcontrollinggimbalindex_inline">getControllingGimbalIndex</a></div></div><div class="inline-doc" id="djiremotecontroller_getcontrollinggimbalindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllingGimbalIndex</h6></div>

~~~java
 void getControllingGimbalIndex(final CommonCallbacks.CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The index of the gimbal that the remote controller is controlling. Commands of the physical buttons (rotating gimbal, shoot photo, record video, etc.) will be directed to the specific gimbal. If there is only one gimbal connected, this setting is reset to the remaining gimbal's index. Enabling <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setattitudesynchronizationenabled">setAttitudeSynchronizationEnabled</a></code> will reset the value to 0. For product that supports only one gimbal, the value is always 0.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Secondary Video

<div class="api-row" id="djiremotecontroller_issecondaryvideooutputsupported"><div class="api-col left">Check Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_issecondaryvideooutputsupported_inline">isSecondaryVideoOutputSupported</a></div></div><div class="inline-doc" id="djiremotecontroller_issecondaryvideooutputsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSecondaryVideoOutputSupported</h6></div>

~~~java
 boolean isSecondaryVideoOutputSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Return whether secondary video output supported. It is supported by Phantom 4 Professional, Matrice 200,  Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideooutputenabled"><div class="api-col left">Set Enable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideooutputenabled_inline">setSecondaryVideoOutputEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideooutputenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOutputEnabled</h6></div>

~~~java
 void setSecondaryVideoOutputEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enable secondary video output on Remote Controller. The remote controller outputs video to the Mobile Device  by default. This will enable a secondary video stream to one of the Remote Controller's physical HDMI and SDI ports.  It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Enables secondary video output.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideooutputenabled"><div class="api-col left">Get Enable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideooutputenabled_inline">getSecondaryVideoOutputEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideooutputenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOutputEnabled</h6></div>

~~~java
 void getSecondaryVideoOutputEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets whether secondary video output on Remote Controller  is enabled. The Remote Controller outputs video to the  Mobile Device by default, but a secondary video can be  routed to its HDMI or SDI port.   Use <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_setsecondaryvideooutputenabled">setSecondaryVideoOutputEnabled</a></code>  to enable or disable,  and <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_setsecondaryvideooutputport">setSecondaryVideoOutputPort</a></code> to choose the port. It is supported by  Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideooutputport"><div class="api-col left">Set Output Port</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideooutputport_inline">setSecondaryVideoOutputPort</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideooutputport_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOutputPort</h6></div>

~~~java
 void setSecondaryVideoOutputPort(SecondaryVideoOutputPort port, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets secondary video output port on Remote Controller. HDMI or SDI are possible. Only one port can be active at once. It is  supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideooutputport">SecondaryVideoOutputPort</a> <font color="#000">port</td><td><font color="#666"><i>Secondary video output port.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideooutputport"><div class="api-col left">Get Output Port</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideooutputport_inline">getSecondaryVideoOutputPort</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideooutputport_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOutputPort</h6></div>

~~~java
 void getSecondaryVideoOutputPort(final CompletionCallbackWith<SecondaryVideoOutputPort> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the secondary video output port on Remote Controller. HDMI or SDI are possible. Only one port can be active at once.  It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideooutputport">SecondaryVideoOutputPort</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideodisplaymode"><div class="api-col left">Set Display Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideodisplaymode_inline">setSecondaryVideoDisplay</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideodisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoDisplay</h6></div>

~~~java
 void setSecondaryVideoDisplay(SecondaryVideoDisplayMode mode, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the secondary video output Picture in Picture (PIP) display mode. The remote controller module can connect to both an  FPV camera (through the HDMI and AV ports) and a camera mounted on the HD Gimbal (through the Gimbal port). The output video  can then be a combination of the two video sources. Either a single video source can be  displayed, or one can be displayed  within the other (as a Picture in Picture, or PIP). If the mode is set incorrectly,  then no output video will be displayed.  It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideodisplaymode">SecondaryVideoDisplayMode</a> <font color="#000">mode</td><td><font color="#666"><i>Picture in Picture (PIP) display mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideodisplaymode"><div class="api-col left">Get Display Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideodisplaymode_inline">getSecondaryVideoDisplay</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideodisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoDisplay</h6></div>

~~~java
 void getSecondaryVideoDisplay(final CompletionCallbackWith<SecondaryVideoDisplayMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the secondary video output Picture in Picture (PIP) display mode. The air link module can connect to both an  FPV  camera (through the HDMI and AV ports) and a camera mounted on the HD Gimbal (through the Gimbal port). The  output video  can then be a combination of the two video sources. Either a single video source can be displayed, or  one can be displayed  within the other (as a Picture in Picture, or PIP). It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideodisplaymode">SecondaryVideoDisplayMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdenabled"><div class="api-col left">Set OSDK Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdenabled_inline">setSecondaryVideoOSDEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDEnabled</h6></div>

~~~java
 void setSecondaryVideoOSDEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables and disables On Screen Display (OSD) overlay on the secondary video. OSD is flight data like altitude, attitude etc.  And can be overlayed on the PIP video. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2, Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Determines whether to display OSD on screen.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdenabled"><div class="api-col left">Get OSD Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdenabled_inline">getSecondaryVideoOSDEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDEnabled</h6></div>

~~~java
 void getSecondaryVideoOSDEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether On Screen Display (OSD) is overlayed on the video feed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdtopmargin"><div class="api-col left">Set OSD Top Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdtopmargin_inline">setSecondaryVideoOSDTopMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdtopmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDTopMargin</h6></div>

~~~java
 void setSecondaryVideoOSDTopMargin(int margin, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the OSD top margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">margin</td><td><font color="#666"><i>Top margin of OSD. The range is [0, 50].</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdtopmargin"><div class="api-col left">Get OSD Top Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdtopmargin_inline">getSecondaryVideoOSDTopMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdtopmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDTopMargin</h6></div>

~~~java
 void getSecondaryVideoOSDTopMargin(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the OSD top margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdleftmargin"><div class="api-col left">Set OSD Left Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdleftmargin_inline">setSecondaryVideoOSDLeftMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdleftmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDLeftMargin</h6></div>

~~~java
 void setSecondaryVideoOSDLeftMargin(int margin, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the OSD left margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">margin</td><td><font color="#666"><i>Left margin of OSD. The range is [0, 50].</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdleftmargin"><div class="api-col left">Get OSD Left Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdleftmargin_inline">getSecondaryVideoOSDLeftMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdleftmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDLeftMargin</h6></div>

~~~java
 void getSecondaryVideoOSDLeftMargin(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the OSD left margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdbottommargin"><div class="api-col left">Set OSD Bottom Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdbottommargin_inline">setSecondaryVideoOSDBottomMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdbottommargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDBottomMargin</h6></div>

~~~java
 void setSecondaryVideoOSDBottomMargin(int margin, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the OSD bottom margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">margin</td><td><font color="#666"><i>Bottom margin of OSD. The range is [0, 50].</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdbottommargin"><div class="api-col left">get OSD Bottom Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdbottommargin_inline">getSecondaryVideoOSDBottomMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdbottommargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDBottomMargin</h6></div>

~~~java
 void getSecondaryVideoOSDBottomMargin(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the OSD bottom margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdrightmargin"><div class="api-col left">Set OSD Right Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdrightmargin_inline">setSecondaryVideoOSDRightMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdrightmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDRightMargin</h6></div>

~~~java
 void setSecondaryVideoOSDRightMargin(int margin, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the OSD right margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">margin</td><td><font color="#666"><i>Right margin of OSD. The range is [0, 50].</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdrightmargin"><div class="api-col left">Get OSD Right Margin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdrightmargin_inline">getSecondaryVideoOSDRightMargin</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdrightmargin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDRightMargin</h6></div>

~~~java
 void getSecondaryVideoOSDRightMargin(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the OSD right margin in video pixels. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideoosdunit"><div class="api-col left">Set OSD Unit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideoosdunit_inline">setSecondaryVideoOSDUnit</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideoosdunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOSDUnit</h6></div>

~~~java
 void setSecondaryVideoOSDUnit(SecondaryVideoOSDUnit unit, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the OSD units to either metric or imperial. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoosdunit">SecondaryVideoOSDUnit</a> <font color="#000">unit</td><td><font color="#666"><i>OSD units.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideoosdunit"><div class="api-col left">Get OSD Unit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideoosdunit_inline">getSecondaryVideoOSDUnit</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideoosdunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOSDUnit</h6></div>

~~~java
 void getSecondaryVideoOSDUnit(final CompletionCallbackWith<SecondaryVideoOSDUnit> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the OSD units (metric or imperial). It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoosdunit">SecondaryVideoOSDUnit</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideooutputformatforhdmi"><div class="api-col left">Set Output Format for HDMI</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideooutputformatforhdmi_inline">setSecondaryVideoOutputFormatForHDMI</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideooutputformatforhdmi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOutputFormatForHDMI</h6></div>

~~~java
 void setSecondaryVideoOutputFormatForHDMI(SecondaryVideoFormat format, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller HDMI video port output video format. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a> <font color="#000">format</td><td><font color="#666"><i>The value of the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a></code> Enum.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideooutputformatforhdmi"><div class="api-col left">Get Output Format for HDMI</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideooutputformatforhdmi_inline">getSecondaryVideoOutputFormatForHDMI</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideooutputformatforhdmi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOutputFormatForHDMI</h6></div>

~~~java
 void getSecondaryVideoOutputFormatForHDMI(final CompletionCallbackWith<SecondaryVideoFormat> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller HDMI video port output video format. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideooutputformatforsdi"><div class="api-col left">Set Output Format For SDI</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideooutputformatforsdi_inline">setSecondaryVideoOutputFormatForSDI</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideooutputformatforsdi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoOutputFormatForSDI</h6></div>

~~~java
 void setSecondaryVideoOutputFormatForSDI(SecondaryVideoFormat format, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the Remote Controller SDI video port output video format. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a> <font color="#000">format</td><td><font color="#666"><i>The value of the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a></code> Enum.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideooutputformatforsdi"><div class="api-col left">Get Output Format For SDI</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideooutputformatforsdi_inline">getSecondaryVideoOutputFormatForSDI</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideooutputformatforsdi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoOutputFormatForSDI</h6></div>

~~~java
 void getSecondaryVideoOutputFormatForSDI(final CompletionCallbackWith<SecondaryVideoFormat> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the Remote Controller SDI video port output video format. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircsecondaryvideoformat">SecondaryVideoFormat</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_setsecondaryvideopipposition"><div class="api-col left">Set PIP Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setsecondaryvideopipposition_inline">setSecondaryVideoPIPPosition</a></div></div><div class="inline-doc" id="djiremotecontroller_setsecondaryvideopipposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSecondaryVideoPIPPosition</h6></div>

~~~java
 void setSecondaryVideoPIPPosition(PIPPosition position, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the PIP (Picture In Picture) position relative to the top left corner of  the main subject video feed. It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">PIPPosition <font color="#000">position</td><td><font color="#666"><i>Position of the PIP on the screen.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getsecondaryvideopipposition"><div class="api-col left">Get PIP Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getsecondaryvideopipposition_inline">getSecondaryVideoPIPPosition</a></div></div><div class="inline-doc" id="djiremotecontroller_getsecondaryvideopipposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoPIPPosition</h6></div>

~~~java
 void getSecondaryVideoPIPPosition(final CompletionCallbackWith<PIPPosition> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the PIP (Picture In Picture) position relative to the top left corner of the main subject video feed.  It is supported by Phantom 4 Professional, Matrice 200, Matrice 200 series V2,  Inspire 1 and Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;PIPPosition&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Live View

<div class="api-row" id="djiremotecontroller_setliveviewsimultaneousoutputenabled"><div class="api-col left">Simultaneous Output Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_setliveviewsimultaneousoutputenabled_inline">setLiveViewSimultaneousOutputEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_setliveviewsimultaneousoutputenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLiveViewSimultaneousOutputEnabled</h6></div>

~~~java
 void setLiveViewSimultaneousOutputEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables the setting to output video to both the mobile device and the HDMI port on the remote controller  simultaneously. When it is disabled and the remote controller is connected to a HDMI display, the mobile  device will not receive the live view. It is only supported by Inspire 1 and M100.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable live view simultaneous output.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_getliveviewsimultaneousoutputenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_getliveviewsimultaneousoutputenabled_inline">getLiveViewSimultaneousOutputEnabled</a></div></div><div class="inline-doc" id="djiremotecontroller_getliveviewsimultaneousoutputenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveViewSimultaneousOutputEnabled</h6></div>

~~~java
 void getLiveViewSimultaneousOutputEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the setting to output video to both the mobile device and the HDMI port on the remote  controller simultaneously is enabled or not. When it is disabled and the remote controller is connected  to a HDMI display, the mobile device will not receive the live view. It is only supported by Inspire 1 and M100.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Focus

<div class="api-row" id="djiremotecontroller_remotefocussupportchecking"><div class="api-col left">Check Remote Focus Support</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_remotefocussupportchecking_inline">isFocusControllerSupported</a></div></div><div class="inline-doc" id="djiremotecontroller_remotefocussupportchecking_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFocusControllerSupported</h6></div>

~~~java
 boolean isFocusControllerSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_is_focus_controller_supported_key">RemoteControllerKey.IS_FOCUS_CONTROLLER_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Query method to check if the Remote Controller supports Remote Focus State Checking.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>



##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


