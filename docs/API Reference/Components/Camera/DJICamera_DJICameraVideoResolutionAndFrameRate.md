<div class="article"><h1 ><font color="#AAA">class </font>ResolutionAndFrameRate</h1></div>

~~~java
@EXClassNullAway
 class ResolutionAndFrameRate implements Comparable<ResolutionAndFrameRate>
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class contains current values for camera parameters related to video resolution and video frame rate.



##### Class Members:

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate_resolution"><div class="api-col left">Resolution</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolutionandframerate_resolution_inline">getResolution</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolutionandframerate_resolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getResolution</h6></div>

~~~java
 VideoResolution getResolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the camera's current video resolution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></td><td><font color="#666"><i>Returns resolution</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate_framerate"><div class="api-col left">Frame Rate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolutionandframerate_framerate_inline">getFrameRate</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolutionandframerate_framerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFrameRate</h6></div>

~~~java
 SettingsDefinitions.VideoFrameRate getFrameRate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the camera's current video frame rate.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></td><td><font color="#666"><i>Returns framerate</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate_fov"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolutionandframerate_fov_inline">getFov</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolutionandframerate_fov_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFov</h6></div>

~~~java
 SettingsDefinitions.VideoFov getFov() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The FOV for recording videos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofov">VideoFov</a></td><td><font color="#666"><i>Returns framerate</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate_initwithresolution"><div class="api-col left">Initialize</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolutionandframerate_initwithresolution_inline">ResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolutionandframerate_initwithresolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ResolutionAndFrameRate</h6></div>

~~~java
 ResolutionAndFrameRate(@NonNull VideoResolution resolution,
                                  @NonNull VideoFrameRate frameRate) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Creates a <code>DJICameraVideoResolutionAndFrameRate</code> instance  with a preset camera video resolution and frame rate. The value  of <code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate_fov">getFov</a></code> is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofov_default">DEFAULT</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a> <font color="#000">resolution</td><td><font color="#666"><i>The specific resolution.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a> <font color="#000">frameRate</td><td><font color="#666"><i>The specific frame rate.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate_initwithresolutionwithframeratefov"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolutionandframerate_initwithresolutionwithframeratefov_inline">ResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolutionandframerate_initwithresolutionwithframeratefov_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ResolutionAndFrameRate</h6></div>

~~~java
 ResolutionAndFrameRate(@NonNull VideoResolution resolution,
                                  @NonNull VideoFrameRate frameRate,
                                  @NonNull SettingsDefinitions.VideoFov fov) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Creates a <code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a></code> instance with a preset camera video  resolution, frame rate and FOV. FOV is only configurable for Mavic 2 Pro and it is only  configurable when the resolution is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution_3840x2160">RESOLUTION_3840x2160</a></code> (4K).  Use <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofov_default">DEFAULT</a></code> when FOV is not configurable.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a> <font color="#000">resolution</td><td><font color="#666"><i>The specific resolution.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a> <font color="#000">frameRate</td><td><font color="#666"><i>The specific frame rate.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofov">VideoFov</a> <font color="#000">fov</td><td><font color="#666"><i>The specific FOV.</i></td></tr></table></html></div>


