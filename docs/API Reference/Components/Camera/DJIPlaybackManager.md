<div class="article"><h1 ><font color="#AAA">class </font>PlaybackManager</h1></div>

~~~java
 class PlaybackManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The playback manager is used to interact with the playback system of the camera. By using the playback manager, the user can control the playback system.



##### Class Members:



#### State Updates

<div class="api-row" id="djiplaybackmanager_setdjicameraplaybackstatecallback"><div class="api-col left">Playback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_setdjicameraplaybackstatecallback_inline">setPlaybackStateCallback</a></div></div><div class="inline-doc" id="djiplaybackmanager_setdjicameraplaybackstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPlaybackStateCallback</h6></div>

~~~java
 void setPlaybackStateCallback(PlaybackState.CallBack cameraPlayBackStateCB) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's playback state callback. Called according to the camera's update timer. <br> <br> Precondition:  <br> You must first define a Callback object to pass in as a parameter. <br> <br> Post  Condition: <br> Every time the playback state changes, the Callback interface that was passed  in as a parameter will call its onResult function. <br> The onResult function takes in a DJICameraPlayBackState  object, which provides playback information such as the number of photos currently selected, the video playback  progress (if a video is being played), and much more.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate">PlaybackState</a>.<a href="/Components/Camera/DJIPlaybackManager_DJICameraPlayBackStateCallBackInterface.html#djiplaybackmanager_djicameraplaybackstatecallbackinterface">CallBack</a> <font color="#000">cameraPlayBackStateCB</td><td><font color="#666"><i>The Callback object to set as the callback interface for when the playback state changes.  &lt;br&gt; The Callback interface implements an onResult function, which takes in a  DJICameraPlayBackState object from the aircraft. &lt;br&gt;</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Single Preview Mode

<div class="api-row" id="djiplaybackmanager_entersinglepreviewmode"><div class="api-col left">Mode Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_entersinglepreviewmode_inline">enterSinglePreviewModeWithIndex</a></div></div><div class="inline-doc" id="djiplaybackmanager_entersinglepreviewmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enterSinglePreviewModeWithIndex</h6></div>

~~~java
 DJIError enterSinglePreviewModeWithIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enters single file preview mode for a file at the specified index. In order for this method to be called,  the camera work mode must be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodeplayback">PLAYBACK</a></code>. <br> <br> @return  DJICameraError Shows the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>File to be previewed at the specified index. The value falls in [1,8].</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_gotonextsinglepreviewpage"><div class="api-col left">Page Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_gotonextsinglepreviewpage_inline">proceedToNextSinglePreviewPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_gotonextsinglepreviewpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>proceedToNextSinglePreviewPage</h6></div>

~~~java
 DJICameraError proceedToNextSinglePreviewPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Goes to the next page. <br> <br> Precondition:<br> The camera must enter Single File Preview Mode.<br> <br>  Special case:<br> If it is the last image, it will go to the first image. @return DJICameraError  Shows the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_gotoprevioussinglepreviewpage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_gotoprevioussinglepreviewpage_inline">proceedToPreviousSinglePreviewPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_gotoprevioussinglepreviewpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>proceedToPreviousSinglePreviewPage</h6></div>

~~~java
 DJICameraError proceedToPreviousSinglePreviewPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Goes back to the previous page. <br> <br> Precondition:<br> The camera must enter Single File Preview Mode. <br> <br> Special case:<br> If it is the first image, it will go to the last image. @return DJICameraError  Shows the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_startvideoplayback"><div class="api-col left">Video Playback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_startvideoplayback_inline">playVideo</a></div></div><div class="inline-doc" id="djiplaybackmanager_startvideoplayback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>playVideo</h6></div>

~~~java
 DJICameraError playVideo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Starts video playback. The selected file must be a video file.<br> <br> Precondition:<br> The camera must enter  Single Preview Mode.<br> <br> Post condition:<br> If the video finishes playing, it will stop and go back to the  beginning of the file. @return DJICameraError Shows the possible error during the execution. If there is no error,  it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_pausevideoplayback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_pausevideoplayback_inline">pauseVideo</a></div></div><div class="inline-doc" id="djiplaybackmanager_pausevideoplayback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pauseVideo</h6></div>

~~~java
 DJICameraError pauseVideo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Pauses a video during playback. <br> <br> Precondition:<br> The video is being played.<br> @return  DJICameraError Shows the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_stopvideoplayback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_stopvideoplayback_inline">stopVideo</a></div></div><div class="inline-doc" id="djiplaybackmanager_stopvideoplayback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopVideo</h6></div>

~~~java
 DJICameraError stopVideo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Stops a video during playback. <br> <br> Precondition:<br> The video is being played.<br> <br> Post condition:<br>  The file will stop and go back to the beginning of the file. @return DJICameraError Shows the possible error during  the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_setvideoplaybackfromlocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_setvideoplaybackfromlocation_inline">playVideoFromPositionInPercent</a></div></div><div class="inline-doc" id="djiplaybackmanager_setvideoplaybackfromlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>playVideoFromPositionInPercent</h6></div>

~~~java
 DJIError playVideoFromPositionInPercent(int location) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Plays a video from the specified location. The selected file must be a video file.<br> <br> Precondition:<br>  The camera must enter Single File Preview Mode.<br> <br> Post condition:<br> The file will play from a specific location immediately. This command can only be called if the video is currently playing or is paused. If paused, the playback position will be updated and playing will resume.
 @return DJICameraError Shows the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">location</td><td><font color="#666"><i>Location from which to play the video must be in the range of [0, 100]. This value  represents at what percent of the entire video it should start playing.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_deletecurrentpreviewfile"><div class="api-col left">Delete File</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_deletecurrentpreviewfile_inline">deleteCurrentPreviewFile</a></div></div><div class="inline-doc" id="djiplaybackmanager_deletecurrentpreviewfile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>deleteCurrentPreviewFile</h6></div>

~~~java
 DJICameraError deleteCurrentPreviewFile() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Deletes the current file being previewed. <br> <br> Precondition:<br> The camera must enter single file preview  mode.<br> <br> Post condition:<br> The image will be deleted from the SD card. @return DJICameraError Shows the  possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Multi Preview Mode

<div class="api-row" id="djiplaybackmanager_entermultiplepreviewmode"><div class="api-col left">Mode Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_entermultiplepreviewmode_inline">enterMultiplePreviewMode</a></div></div><div class="inline-doc" id="djiplaybackmanager_entermultiplepreviewmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enterMultiplePreviewMode</h6></div>

~~~java
 DJICameraError enterMultiplePreviewMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables the user to preview multiple files when the camera is in Playback mode. <br> <br> Precondition:<br> The  camera work mode should be set to Playback mode.<br> <br> Post condition:<br> There will be 8 images on one page.  @return DJICameraError Shows the possible error during the execution. If there is no error, it returns  <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_gotonextmultiplepreviewpage"><div class="api-col left">Page Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_gotonextmultiplepreviewpage_inline">proceedToNextMultiplePreviewPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_gotonextmultiplepreviewpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>proceedToNextMultiplePreviewPage</h6></div>

~~~java
 DJICameraError proceedToNextMultiplePreviewPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Goes to the next page when there are multiple pages. <br> <br> Precondition:<br> The camera must enter Multiple  Preview Mode.<br> <br> Special case:<br> If it is the last page, it will stay at the last page.  @return DJICameraErrorr Shows the possible error during the execution. If there is no error, it  returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_gotopreviousmultiplepreviewpage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_gotopreviousmultiplepreviewpage_inline">proceedToPreviousMultiplePreviewPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_gotopreviousmultiplepreviewpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>proceedToPreviousMultiplePreviewPage</h6></div>

~~~java
 DJICameraError proceedToPreviousMultiplePreviewPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Goes back to the previous page when there are multiple pages. <br> <br> Precondition:<br>  The camera must enter Multiple Preview Mode.<br> <br> Special case:<br> If it is the first page, it will  stay at the first page. @return DJICameraError Shows the possible error during the execution. If there is  no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Multi Edit Mode

<div class="api-row" id="djiplaybackmanager_entermultipleeditmode"><div class="api-col left">Mode Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_entermultipleeditmode_inline">enterMultipleEditMode</a></div></div><div class="inline-doc" id="djiplaybackmanager_entermultipleeditmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enterMultipleEditMode</h6></div>

~~~java
 DJICameraError enterMultipleEditMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">This enables the user to select, download, or delete multiple media files when the camera is in Playback mode. <br> Precondition:<br> The camera work mode must be set to Camera Play back mode and then Multiple Preview Mode.<br>  <br> Post condition:<br> Multiple photos can be selected to be downloaded or deleted. @return DJICameraError Shows the  possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_exitmultipleeditmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_exitmultipleeditmode_inline">exitMultipleEditMode</a></div></div><div class="inline-doc" id="djiplaybackmanager_exitmultipleeditmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exitMultipleEditMode</h6></div>

~~~java
 DJICameraError exitMultipleEditMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Exits multiple edit mode. @return DJICameraError Shows the possible error during the execution. If there is no error, it returns null.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_togglefileselectionatindex"><div class="api-col left">Selection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_togglefileselectionatindex_inline">toggleFileSelectionAtIndex</a></div></div><div class="inline-doc" id="djiplaybackmanager_togglefileselectionatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>toggleFileSelectionAtIndex</h6></div>

~~~java
 DJIError toggleFileSelectionAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Selects or unselects a file at the specified index of the current page. This index is unrelated to the filename,  and is used in multiple edit mode. <br> <br> Precondition:<br> The camera must enter Multiple Edit Mode. <br>  @return DJICameraError Shows the possible error during the execution. If there is no error, it returns  <code>null</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index at which to select a file. The value falls in [1,8]. However, the exact range should depends on how many photos totally in current page.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_selectallfiles"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_selectallfiles_inline">selectAllFiles</a></div></div><div class="inline-doc" id="djiplaybackmanager_selectallfiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>selectAllFiles</h6></div>

~~~java
 DJICameraError selectAllFiles() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Selects all the files on the SD card. <br> <br> Precondition:<br> The camera must enter Multi Edit Mode.  @return DJICameraError Shows the possible error during the execution. If there is no error, it  returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_unselectallfiles"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_unselectallfiles_inline">unselectAllFiles</a></div></div><div class="inline-doc" id="djiplaybackmanager_unselectallfiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unselectAllFiles</h6></div>

~~~java
 DJICameraError unselectAllFiles() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Unselects all the files on the SD card. <br> Precondition:<br> The camera must enter Multiple Edit Mode.  @return DJICameraError Shows the possible error during the execution. If there is no error,  it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_selectallfilesinpage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_selectallfilesinpage_inline">selectAllFilesInPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_selectallfilesinpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>selectAllFilesInPage</h6></div>

~~~java
 DJICameraError selectAllFilesInPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Selects all the file(s) on the current page. <br> <br> Precondition:<br> The camera must enter Multiple Edit Mode.   @return DJICameraError Shows the possible error during the execution. If there is no error, it returns  <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_unselectallfilesinpage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_unselectallfilesinpage_inline">unselectAllFilesInPage</a></div></div><div class="inline-doc" id="djiplaybackmanager_unselectallfilesinpage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unselectAllFilesInPage</h6></div>

~~~java
 DJICameraError unselectAllFilesInPage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Unselects all the file(s) on the current page. <br> <br> Precondition:<br> The camera must enter Multiple Edit  Mode. @return DJICameraError Shows the possible error during the execution. If there is no error, it  returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_deleteallselectedfiles"><div class="api-col left">Delete Files</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_deleteallselectedfiles_inline">deleteAllSelectedFiles</a></div></div><div class="inline-doc" id="djiplaybackmanager_deleteallselectedfiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>deleteAllSelectedFiles</h6></div>

~~~java
 DJICameraError deleteAllSelectedFiles() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Deletes all selected files from the SD card. <br> <br> Precondition:<br> The camera must enter Multiple Edit Mode. <br> <br> Post condition:<br> The images will be deleted from the SD card.  @return DJICameraError Shows  the possible error during the execution. If there is no error, it returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a></code> shows the possible error during the execution. If there is no error, it returns null.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_downloadselectedfiles"><div class="api-col left">Download Files</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_downloadselectedfiles_inline">downloadSelectedFiles</a></div></div><div class="inline-doc" id="djiplaybackmanager_downloadselectedfiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>downloadSelectedFiles</h6></div>

~~~java
 void downloadSelectedFiles(final File destDir, final FileDownloadCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Downloads the currently selected media files. <br> <br> Precondition:<br> The camera must enter multiple preview mode.<br> <br>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final File <font color="#000">destDir</td><td><font color="#666"><i>The destination file directory, e.g., SDCardPath/folder/</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJIPlaybackManager_CameraFileDownloadCallbackInterface.html#djiplaybackmanager_camerafiledownloadcallbackinterface">FileDownloadCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiplaybackmanager_camerafiledownloadcallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIPlaybackManager_CameraFileDownloadCallbackInterface.html">FileDownloadCallback</a></div></div><div class="api-row" id="djiplaybackmanager_djicameraplaybackstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html">PlaybackState</a></div></div>
