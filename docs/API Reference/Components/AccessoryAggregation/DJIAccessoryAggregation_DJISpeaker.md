<div class="article"><h1 ><font color="#AAA">class </font>Speaker</h1></div>

~~~java
 class Speaker extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">The class represents the speaker accessory on the aircraft. Used transmit audio  files and control the speaker.



##### Class Members:

<div class="api-row" id="djiaccessoryaggregation_djispeaker_fileliststate"><div class="api-col left">File List State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_fileliststate_inline">getFileListState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_fileliststate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileListState</h6></div>

~~~java
 FileListState getFileListState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Current file list state of the speaker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_datatransmissionstate"><div class="api-col left">Data Transmission State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_datatransmissionstate_inline">getDataTransmissionState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_datatransmissionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDataTransmissionState</h6></div>

~~~java
 SpeakerDataTransmissionState getDataTransmissionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">The data transmission state of the speaker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate">SpeakerDataTransmissionState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate">SpeakerDataTransmissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_setvolume"><div class="api-col left">Set Volume</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_setvolume_inline">setVolume</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_setvolume_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVolume</h6></div>

~~~java
 void setVolume(@IntRange(from = MIN_VOLUME, to = MAX_VOLUME) int value,
                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Sets the volume to play audio. The valid range is [0, 100]. 100 means loudest.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = MIN_VOLUME, to = MAX_VOLUME) int <font color="#000">value</td><td><font color="#666"><i>Volume value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_setplaymode"><div class="api-col left">Set Play Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_setplaymode_inline">setPlayMode</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_setplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPlayMode</h6></div>

~~~java
 void setPlayMode(@NonNull SettingsDefinitions.PlayMode mode,
                            @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Sets the play mode of the speaker to control the behavior after finishing playing a file.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplaymode">PlayMode</a> <font color="#000">mode</td><td><font color="#666"><i>The play mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_starttransmission"><div class="api-col left">Start Transmission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_starttransmission_inline">startTransmission</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_starttransmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startTransmission</h6></div>

~~~java
 void startTransmission(@NonNull AudioFileInfo info, @Nullable final TransmissionListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Starts to send a complete audio file to the aircraft, which can be played by the speaker.  A transmission session can only be started when the transmission state is in <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_idle">IDLE</a></code>.  If the transmission is started successfully, the state will change  to <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_readytotransmit">READY_TO_TRANSMIT</a></code>. Then  call <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_pacedata">paceData</a></code> to send data to SDK.  Call <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_markeof">markEOF</a></code> when all data has been sent to SDK. SDK will maintain a  buffer to hold all the data and transmit it to the aircraft. For M2E Speaker, the audio file to transmit  should fulfill the following configurations: <br> - The speaker only receives raw PCM(Pulse-code modulation) data of an audio file,  if the audio file is compressed, PCM extraction is needed before the transmission. <br> - The audio channel is mono. <br> -  The audio sample rate is 44,100 Hz. <br> - The PCM (Pulse-code modulation) sample  depth is 16 bit per sample. <br> - The audio file is stored in the aircraft instead  of the speaker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJIAudioFileInfo.html#djiaccessoryaggregation_djispeaker_djiaudiofileinfo">AudioFileInfo</a> <font color="#000">info</td><td><font color="#666"><i>The information of the file to transmit. It is also used to determine the  location the file will be stored in the aircraft.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_TransmissionListenerInterface.html#djiaccessoryaggregation_djispeaker_transmissionlistenerinterface">TransmissionListener</a> <font color="#000">listener</td><td><font color="#666"><i>Inform the progress of the data transfer.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_pacedata"><div class="api-col left">Pace Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_pacedata_inline">paceData</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_pacedata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>paceData</h6></div>

~~~java
 boolean paceData(@NonNull @Size(MAX_INPUT_SIZE) byte[] data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Sends raw PCM data of the audio file to SDK internal logic.  For Mavic 2 Enterprise, the transmission rate is limited to 80kB/s by sdk.  Therefore, SDK will cache the paced data to a local file when the rate of pacing data is over 80kB/s. The paced data will be appended  to the local file. Call <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_markeof">markEOF</a></code> when all data of the data has been paced to SDK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull @Size(MAX_INPUT_SIZE) byte[] <font color="#000">data</td><td><font color="#666"><i>Raw PCM data stream in bytes.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if data is paced successfully. Otherwise, pacing data is not in the current state or the data size is illegal.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_markeof"><div class="api-col left">Mark EOF</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_markeof_inline">markEOF</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_markeof_inline"

><div class="article"><h6 ><font color="#AAA">method </font>markEOF</h6></div>

~~~java
 DJIError markEOF() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Marks EOF (end-of-file). It is used to inform SDK that all data of the file has been paced. SDK will continue  to transmit data to the aircraft. The state will change to <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_idle">IDLE</a></code> when all data is transmitted.  After calling this method, <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_pacedata">paceData</a></code> is invalid until a new transmission session starts. If no  data is paced before calling this method, the transmission session will end immediately.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The occurred error if any.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_canceltransmission"><div class="api-col left">Cancel Transmission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_canceltransmission_inline">cancelTransmission</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_canceltransmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>cancelTransmission</h6></div>

~~~java
 void cancelTransmission() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">This will entirely stop the data transfer process and of course clean the transfer thread pool.

</div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_play"><div class="api-col left">Play</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_play_inline">play</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_play_inline"

><div class="article"><h6 ><font color="#AAA">method </font>play</h6></div>

~~~java
 void play(int fileIndex, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Starts to play the audio file with the specific index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">fileIndex</td><td><font color="#666"><i>The file index of the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile">AudioMediaFile</a></code> to play.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_stopaudioplaywithcompletion"><div class="api-col left">Stop Audio Play</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_stopaudioplaywithcompletion_inline">stop</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_stopaudioplaywithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Stops the speaker from playing audio. The method is only valid when  the playing state is <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplayingstate_playing">PLAYING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_rename"><div class="api-col left">Rename</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_rename_inline">rename</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_rename_inline"

><div class="article"><h6 ><font color="#AAA">method </font>rename</h6></div>

~~~java
 void rename(int index, String filename, final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Renames the audio file with the specific index. If the operation is started  successfully, FileListState will become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_renaming">RENAMING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index of the audio file to rename.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">filename</td><td><font color="#666"><i>The new file name of the audio file. The file name should not exceed 128 characters.</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_filelistsnapshot"><div class="api-col left">Get File List Snapshot</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_filelistsnapshot_inline">getFileListSnapshot</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_filelistsnapshot_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileListSnapshot</h6></div>

~~~java
@Nullable
 List<AudioMediaFile> getFileListSnapshot() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Returns a copy of the current audio file list from the storage. Returns <code>null</code>  if <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_fileliststate">getFileListState</a></code> is reset.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile">AudioMediaFile</a>&gt;</td><td><font color="#666"><i>An array of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile">AudioMediaFile</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_refreshfilelist"><div class="api-col left">Refresh File List</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_refreshfilelist_inline">refreshFileList</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_refreshfilelist_inline"

><div class="article"><h6 ><font color="#AAA">method </font>refreshFileList</h6></div>

~~~java
 void refreshFileList(final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Refresh the audio file list in the aircraft. <br> - If the current state  is <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_reset">RESET</a></code>, SDK  will try to fetch the complete file list. <br> - If the current state is <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_incomplete">INCOMPLETE</a></code>, SDK  will only fetch the missing list of files. <br> - If the operation is started successfully,  the <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code>  will become  <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_syncing">SYNCING</a></code>. <br> - When the  file list is refreshed successfully, the <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code> will become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_uptodate">UP_TO_DATE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_deletefiles"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_deletefiles_inline">delete</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_deletefiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>delete</h6></div>

~~~java
 void delete(@NonNull List<Integer> fileIndices,
                       final CommonCallbacks.CompletionCallbackWithTwoParam<List<Integer>, DJIError> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Deletes audio files in the aircraft. If the operation is started successfully, <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_fileliststate">getFileListState</a></code> will  become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_deleting">DELETING</a></code>. If there is error or  "failedFiles" is not empty, <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_fileliststate">getFileListState</a></code>  will become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_reset">RESET</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull List&lt;Integer&gt; <font color="#000">fileIndices</td><td><font color="#666"><i>A list of AudioMediaFile's index.</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWithTwoParam&lt;List&lt;Integer&gt;, <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_addfileliststatelistener"><div class="api-col left">Add File List State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_addfileliststatelistener_inline">addFileListStateListener</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_addfileliststatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addFileListStateListener</h6></div>

~~~java
 void addFileListStateListener(FileListStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Start listen to the update of <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_fileliststate">getFileListState</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_removefileliststatelistener"><div class="api-col left">Remove File List State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_removefileliststatelistener_inline">removeFileListStateListener</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_removefileliststatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeFileListStateListener</h6></div>

~~~java
 void removeFileListStateListener(FileListStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Stop listen to the update of <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_fileliststate">getFileListState</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>



#### State Updates

<div class="api-row" id="djiaccessoryaggregation_djispeaker_setstatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_setstatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_setstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable SpeakerState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback that updates speaker state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJISpeakerState.html#djiaccessoryaggregation_djispeaker_djispeakerstate">SpeakerState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJISpeakerState.html">SpeakerState</a></div></div><div class="api-row" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJIAudioFileInfo.html">AudioFileInfo</a></div></div><div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerplaymode_inline">PlayMode</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerplaymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PlayMode</h6></div>

~~~java
 enum PlayMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The speaker's play mode. It determines the behavior of the speaker when it finishes playing a file.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplaymode_singleonce_inline"></a>SINGLE_ONCE</td><td><font color="#666">The speaker will play the selected file once. The speaker will stop playing after  finishing playing the file.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplaymode_repeatsingle_inline"></a>REPEAT_SINGLE</td><td><font color="#666">The speaker will play the selected file repeatedly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplaymode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerplayingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerplayingstate_inline">SpeakerPlayingState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerplayingstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SpeakerPlayingState</h6></div>

~~~java
 enum SpeakerPlayingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The speaker's Playing State.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplayingstate_playing_inline"></a>PLAYING</td><td><font color="#666">The speaker is playing the voice.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplayingstate_stopped_inline"></a>STOPPED</td><td><font color="#666">The speaker is stopped and playing nothing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerplayingstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_inline">SpeakerDataTransmissionState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SpeakerDataTransmissionState</h6></div>

~~~java
 enum SpeakerDataTransmissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">Data transmission state of the speaker.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_idle_inline"></a>IDLE</td><td><font color="#666">The speaker is in idle state and is ready for receiving data from the mobile device.  Call <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_starttransmission">startTransmission</a></code> to start the data transmission.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_readytotransmit_inline"></a>READY_TO_TRANSMIT</td><td><font color="#666">The data transmission from the mobile device to the speaker is started.  Call <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_pacedata">paceData</a></code> to transmit data.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_transmitting_inline"></a>TRANSMITING</td><td><font color="#666">The mobile device is transmitting data to the speaker.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccessoryaggregation_djispeaker_djispeakerdatatransmissionstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown state, either the speaker is disconnected or not recognized.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_transmissionlistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_TransmissionListenerInterface.html">TransmissionListener</a></div></div>

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


