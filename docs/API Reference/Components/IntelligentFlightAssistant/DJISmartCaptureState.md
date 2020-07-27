<div class="article"><h1 ><font color="#AAA">class </font>SmartCaptureState</h1></div>

~~~java
 class SmartCaptureState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The object includes all information related to SmartCapture.



##### Class Members:

<div class="api-row" id="djismartcapturestate_systemstatus"><div class="api-col left">Capture State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_systemstatus_inline">getSystemStatus</a></div></div><div class="inline-doc" id="djismartcapturestate_systemstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSystemStatus</h6></div>

~~~java
 SmartCaptureSystemStatus getSystemStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The system status of SmartCapture.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturesystemstatus">SmartCaptureSystemStatus</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturesystemstatus">SmartCaptureSystemStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djismartcapturestate_action"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_action_inline">getAction</a></div></div><div class="inline-doc" id="djismartcapturestate_action_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAction</h6></div>

~~~java
 SmartCaptureAction getAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The executing SmartCapture action.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcaptureaction">SmartCaptureAction</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcaptureaction">SmartCaptureAction</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djismartcapturestate_followingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_followingmode_inline">getFollowingMode</a></div></div><div class="inline-doc" id="djismartcapturestate_followingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFollowingMode</h6></div>

~~~java
 SmartCaptureFollowingMode getFollowingMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The following mode of SmartCapture.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturefollowingmode">SmartCaptureFollowingMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturefollowingmode">SmartCaptureFollowingMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djismartcapturestate_photocountdown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_photocountdown_inline">getPhotoCountdown</a></div></div><div class="inline-doc" id="djismartcapturestate_photocountdown_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoCountdown</h6></div>

~~~java
 float getPhotoCountdown() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The countdown for shooting photo.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>An int value of photo countdown.</i></td></tr></table></html></div>

<div class="api-row" id="djismartcapturestate_targetrect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_targetrect_inline">getTargetRect</a></div></div><div class="inline-doc" id="djismartcapturestate_targetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRect</h6></div>

~~~java
 RectF getTargetRect() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The dimension of the detected target. It is <code>CGRectNull</code> when the target is invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF</td><td><font color="#666"><i>The detected target's dimension.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djismartcapturestate_djismartcapturesystemstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_djismartcapturesystemstatus_inline">SmartCaptureSystemStatus</a></div></div><div class="inline-doc" id="djismartcapturestate_djismartcapturesystemstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SmartCaptureSystemStatus</h6></div>

~~~java
@EXClassNullAway
 enum SmartCaptureSystemStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The system status of SmartCapture.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_initializing_inline"></a>INITIALIZING</td><td><font color="#666">SmartCapture is initializing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_notflyingandfaceawareactivating_inline"></a>NOT_FLYING_AND_FACE_AWARE_ACTIVATING</td><td><font color="#666">The aircraft is not flying and detecting a human face in front of the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_notflyingandfaceawareactivated_inline"></a>NOT_FLYING_AND_FACE_AWARE_ACTIVATED</td><td><font color="#666">The aircraft is not flying and FaceAware has been activated. The aircraft will  push the dimension of the target through <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_targetrect">getTargetRect</a></code>  of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate">SmartCaptureState</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_gesturelaunch_inline"></a>GESTURE_LAUNCH</td><td><font color="#666">GestureLaunch is recognized and the aircraft is taking off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_flyingandfaceawareactivating_inline"></a>FLYING_AND_FACE_AWARE_ACTIVATING</td><td><font color="#666">The aircraft is flying and detecting human faces in front of the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_flyingandfaceawareactivated_inline"></a>FLYING_AND_FACE_AWARE_ACTIVATED</td><td><font color="#666">The aircraft is flying and detected one or more than one human faces in front of the camera.  One of the detected human can raise a hand to confirm the control. Then the SmartCapture  state will change to <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturesystemstatus_following">FOLLOWING</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_following_inline"></a>FOLLOWING</td><td><font color="#666">The aircraft is following the target but not SmartCapture action is recognized.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_palmcontrol_inline"></a>PALM_CONTROL</td><td><font color="#666">The aircraft is executing PalmControl (controlling the position or the distance).  See <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_action">getAction</a></code> of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate">SmartCaptureState</a></code> for more detail.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_cameracaptureaction_inline"></a>CAMERA_CAPTURE_ACTION</td><td><font color="#666">The aircraft is executing camera related action (e.g. shoot photos).  See <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_action">getAction</a></code> of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate">SmartCaptureState</a></code> for more detail.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_gestureland_inline"></a>GESTURE_LAND</td><td><font color="#666">GestureLand is recognized and the aircraft is landing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturesystemstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djismartcapturestate_djismartcaptureaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_djismartcaptureaction_inline">SmartCaptureAction</a></div></div><div class="inline-doc" id="djismartcapturestate_djismartcaptureaction_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SmartCaptureAction</h6></div>

~~~java
 enum  SmartCaptureAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Different actions supported by SmartCapture.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_none_inline"></a>NONE</td><td><font color="#666">No action is being executed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_adjustingposition_inline"></a>ADJUSTING_POSITION</td><td><font color="#666">The user is adjusting the aircraft's position. Move the palm up  or down slowly to control the aircraft's altitude. Move the arm  left or right to control the aircraft's orientation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_adjustingdistance_inline"></a>ADJUSTING_DISTANCE</td><td><font color="#666">The user is adjusting distance between the aircraft and the user.  Move two hands apart and the aircraft will fly away from the user.  The maximum distance is 19.7ft (6m). Move two hands together and  the aircraft will fly towards the user. The minimum distance is 6.6ft (2m).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_switchingcontrol_inline"></a>SWITCHING_CONTROL</td><td><font color="#666">The control of the aircraft is being switched from one person to the other.  The current user drops hand towards the floor. The Front LEDs will turn solid green.  The person who would like to control the aircraft raise palm in front of the aircraft.  When the Front LEDs blinks green slowly, it indicates the control is switched successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_shootingphoto_inline"></a>SHOOTING_PHOTO</td><td><font color="#666">The camera is shooting photos. Make a V gesture with one hand to trigger the action. Once the  gesture is recognized, two-second countdown will begin (<code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_photocountdown">getPhotoCountdown</a></code>  of <code><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate">SmartCaptureState</a></code>).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_recordingvideo_inline"></a>RECORDING_VIDEO</td><td><font color="#666">The camera is recording video. To start this, make a frame gesture with fingers from both hands.  Once the gesture is recognized, the aircraft's front LEDs will turn off and the camera will start  recording. After five seconds, use the same gesture to stop the recording.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcaptureaction_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djismartcapturestate_djismartcapturefollowingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djismartcapturestate_djismartcapturefollowingmode_inline">SmartCaptureFollowingMode</a></div></div><div class="inline-doc" id="djismartcapturestate_djismartcapturefollowingmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SmartCaptureFollowingMode</h6></div>

~~~java
 enum SmartCaptureFollowingMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Different following modes of SmartCapture.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturefollowingmode_trace_inline"></a>TRACE</td><td><font color="#666">Aircraft follows the target at constant distance.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturefollowingmode_profile_inline"></a>PROFILE</td><td><font color="#666">Aircraft follows the target at constant angle and distance from the side.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djismartcapturestate_djismartcapturefollowingmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


