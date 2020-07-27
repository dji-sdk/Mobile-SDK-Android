<div class="article"><h1 ><font color="#AAA">class </font>VideoPlaybackState</h1></div>

~~~java
 static class VideoPlaybackState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The playback state of the media manager.



##### Class Members:

<div class="api-row" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playingmedia"><div class="api-col left">File</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_djimediavideoplaybackstate_playingmedia_inline">getPlayingMediaFile</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playingmedia_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlayingMediaFile</h6></div>

~~~java
 MediaFile getPlayingMediaFile() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The video media file that is playing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playbackstatus"><div class="api-col left">Playback Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_djimediavideoplaybackstate_playbackstatus_inline">getPlaybackStatus</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playbackstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlaybackStatus</h6></div>

~~~java
 VideoPlaybackStatus getPlaybackStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The status of the playback (e.g. playing or paused).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_VideoPlayback_DJIMediaVideoPlaybackState.html#djimediamanager_videoplayback_djimediavideoplaybackstatus">VideoPlaybackStatus</a></td><td><font color="#666"><i>An Enum value of <code><a href="/Components/Camera/DJIMediaManager_VideoPlayback_DJIMediaVideoPlaybackState.html#djimediamanager_videoplayback_djimediavideoplaybackstatus">VideoPlaybackStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playingposition"><div class="api-col left">Video Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_djimediavideoplaybackstate_playingposition_inline">getPlayingPosition</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_djimediavideoplaybackstate_playingposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlayingPosition</h6></div>

~~~java
 float getPlayingPosition() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The playing position in seconds.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the playing position in seconds.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djimediamanager_videoplayback_djimediavideoplaybackstatus"><div class="api-col left">Playback Status</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_djimediavideoplaybackstatus_inline">VideoPlaybackStatus</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_djimediavideoplaybackstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoPlaybackStatus</h6></div>

~~~java
 enum VideoPlaybackStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The playback status.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_videoplayback_djimediavideoplaybackstatus_stopped_inline"></a>STOPPED</td><td><font color="#666">The playback is stopped. No media is playing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_videoplayback_djimediavideoplaybackstatus_playing_inline"></a>PLAYING</td><td><font color="#666">The media manager is playing a video.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_videoplayback_djimediavideoplaybackstatus_paused_inline"></a>PAUSED</td><td><font color="#666">The playing video is paused.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_videoplayback_djimediavideoplaybackstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The playing video is unknown.</td></tr></table></html>

##### Class Members:

</div>


