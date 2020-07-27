<div class="article"><h1 ><font color="#AAA">class </font>DJICameraError</h1></div>

~~~java
@EXClassNullAway
 class DJICameraError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Defines all camera-related errors.



##### Class Members:

<div class="api-row" id="djierror_djicameraerror_getdjierrorconstructor1"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_getdjierrorconstructor1_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djicameraerror_getdjierrorconstructor1_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(Ccode ccode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Constructor Method 1.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Ccode <font color="#000">ccode</td><td><font color="#666"><i>Error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The DJIError object.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djierror_djicameraerror_common_camera_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_common_camera_unknown_inline">UNKNOWN_ERROR</a></div></div><div class="inline-doc" id="djierror_djicameraerror_common_camera_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN_ERROR</h6></div>

~~~java
 static final DJICameraError UNKNOWN_ERROR =
        new DJICameraError("Server error, please contact <dev@dji.com> for help.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unknown.

</div>

<div class="api-row" id="djierror_djicameraerror_check_permission_level1_is_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_check_permission_level1_is_invalid_inline">CHECK_PERMISSION_LEVEL1_IS_INVALID</a></div></div><div class="inline-doc" id="djierror_djicameraerror_check_permission_level1_is_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CHECK_PERMISSION_LEVEL1_IS_INVALID</h6></div>

~~~java
 static final DJICameraError CHECK_PERMISSION_LEVEL1_IS_INVALID = new DJICameraError ("Level 1 API permission is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Level 1 API permission is invalid. This error indicates that the API Key's level 1 permission is invalid.

</div>

<div class="api-row" id="djierror_djicameraerror_media_invalid_request_type"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_media_invalid_request_type_inline">MEDIA_INVALID_REQUEST_TYPE</a></div></div><div class="inline-doc" id="djierror_djicameraerror_media_invalid_request_type_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_INVALID_REQUEST_TYPE</h6></div>

~~~java
 static final DJICameraError MEDIA_INVALID_REQUEST_TYPE = new DJICameraError ("Media download result: media downloading request type is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Result of media downloading request type is invalid.

</div>

<div class="api-row" id="djierror_djicameraerror_media_no_submedia_files"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_media_no_submedia_files_inline">MEDIA_NO_SUBMEDIA_FILES</a></div></div><div class="inline-doc" id="djierror_djicameraerror_media_no_submedia_files_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_NO_SUBMEDIA_FILES</h6></div>

~~~java
 static final DJICameraError MEDIA_NO_SUBMEDIA_FILES = new DJICameraError ("Sub media fetching result: No sub media files")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No sub media files.

</div>

<div class="api-row" id="djierror_djicameraerror_media_request_client_abort"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_media_request_client_abort_inline">MEDIA_REQUEST_CLIENT_ABORT</a></div></div><div class="inline-doc" id="djierror_djicameraerror_media_request_client_abort_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_CLIENT_ABORT</h6></div>

~~~java
 static final DJICameraError MEDIA_REQUEST_CLIENT_ABORT = new DJICameraError ("Media download result: the client aborted the download")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Result of media downloading: the client aborted the download.

</div>

<div class="api-row" id="djierror_djicameraerror_media_request_server_abort"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_media_request_server_abort_inline">MEDIA_REQUEST_SERVER_ABORT</a></div></div><div class="inline-doc" id="djierror_djicameraerror_media_request_server_abort_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_SERVER_ABORT</h6></div>

~~~java
 static final DJICameraError MEDIA_REQUEST_SERVER_ABORT = new DJICameraError("Media download result: the server aborted the download")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Result of media downloading: the server aborted the download.

</div>

<div class="api-row" id="djierror_djicameraerror_media_request_disconnect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_media_request_disconnect_inline">MEDIA_REQUEST_DISCONNECT</a></div></div><div class="inline-doc" id="djierror_djicameraerror_media_request_disconnect_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_DISCONNECT</h6></div>

~~~java
 static final DJICameraError MEDIA_REQUEST_DISCONNECT = new DJICameraError ("Media download result: the download link disconnected")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Result of media downloading: the download link disconnected.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_could_not_delete_all_files"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_could_not_delete_all_files_inline">COULD_NOT_DELETE_ALL_FILES</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_could_not_delete_all_files_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COULD_NOT_DELETE_ALL_FILES</h6></div>

~~~java
 static final DJICameraError COULD_NOT_DELETE_ALL_FILES = new DJICameraError("Could not delete all files")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Could not delete all files.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_cannot_set_parameters_in_this_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_cannot_set_parameters_in_this_state_inline">CANNOT_SET_PARAMETERS_IN_THIS_STATE</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_cannot_set_parameters_in_this_state_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_SET_PARAMETERS_IN_THIS_STATE</h6></div>

~~~java
 static final DJICameraError CANNOT_SET_PARAMETERS_IN_THIS_STATE =
        new DJICameraError("Cannot set the parameters in this state")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Cannot set the parameters in this state.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_get_remote_media_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_get_remote_media_failed_inline">GET_REMOTE_MEDIA_FAILED</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_get_remote_media_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GET_REMOTE_MEDIA_FAILED</h6></div>

~~~java
 static final DJICameraError GET_REMOTE_MEDIA_FAILED = new DJICameraError("Get remote media failed")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Failed to get remote media data.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_get_thumbnail_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_get_thumbnail_failed_inline">GET_THUMBNAIL_FAILED</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_get_thumbnail_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GET_THUMBNAIL_FAILED</h6></div>

~~~java
 static final DJICameraError GET_THUMBNAIL_FAILED = new DJICameraError("Failed to get the thumbnail")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Get thumbnail picture failed.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_connection_not_ok"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_connection_not_ok_inline">NOT_CONNECTED</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_connection_not_ok_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_CONNECTED</h6></div>

~~~java
 static final DJICameraError NOT_CONNECTED = new DJICameraError("Connection is not ok")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Camera connection isn't ok.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_exec_timeout"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_exec_timeout_inline">EXEC_TIMEOUT</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_exec_timeout_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXEC_TIMEOUT</h6></div>

~~~java
 static final DJICameraError EXEC_TIMEOUT =
        new DJICameraError("Camera's execution of this action has timed out")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The camera action executed a timeout.

</div>

<div class="api-row" id="djierror_djicameraerror_camera_invalid_param"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_invalid_param_inline">INVALID_PARAMETERS</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_invalid_param_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_PARAMETERS</h6></div>

~~~java
 static final DJICameraError INVALID_PARAMETERS = new DJICameraError("Camera received invalid parameters")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Camera invalid parameters.<br> This error will be returned when the sent parameters are invalid.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_unsupported_cmd_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_unsupported_cmd_state_inline">UNSUPPORTED_CMD_STATE</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_unsupported_cmd_state_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNSUPPORTED_CMD_STATE</h6></div>

~~~java
 static final DJICameraError UNSUPPORTED_CMD_STATE =
        new DJICameraError("Camera is busy or the command is not supported in the Camera's current state")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The camera does not support the command in the current state.<br> This error is returned when the camera is busy and the camera is unsupported for the command in the current state.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_parameters_set_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_parameters_set_failed_inline">PARAMETERS_SET_FAILED</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_parameters_set_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>PARAMETERS_SET_FAILED</h6></div>

~~~java
 static final DJICameraError PARAMETERS_SET_FAILED =
        new DJICameraError("Camera failed to set the parameters it received")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Failed to set the parameters.<br> This error will be returned when setting the camera parameters fails.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_parameters_get_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_parameters_get_failed_inline">PARAMETERS_GET_FAILED</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_parameters_get_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>PARAMETERS_GET_FAILED</h6></div>

~~~java
 static final DJICameraError PARAMETERS_GET_FAILED = new DJICameraError("Camera param get failed")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Failed to get the parameters.<br> This error will be returned when getting the camera parameters fails.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_parameters_not_available"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_parameters_not_available_inline">PARAMETERS_NOT_AVAILABLE</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_parameters_not_available_inline"

><div class="article"><h6 ><font color="#AAA">final </font>PARAMETERS_NOT_AVAILABLE</h6></div>

~~~java
 static final DJICameraError PARAMETERS_NOT_AVAILABLE =
        new DJICameraError("Camera received invalid parameters")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The parameters are not available. <br> This error will be returned when there are some errors with the parameters submitted to the camera.<br>

</div>

<div class="api-row" id="djierror_djicameraerror_camera_media_file_reset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_camera_media_file_reset_inline">MEDIA_FILE_RESET</a></div></div><div class="inline-doc" id="djierror_djicameraerror_camera_media_file_reset_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_FILE_RESET</h6></div>

~~~java
 static final DJICameraError MEDIA_FILE_RESET = new DJICameraError("Media file is reset. The operation cannot be executed.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Media file is reset. The operation can be executed.

</div>

<div class="api-row" id="djierror_djicameraerror_custom_info_length_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_custom_info_length_error_inline">CUSTOM_INFO_LENGTH_ERROR</a></div></div><div class="inline-doc" id="djierror_djicameraerror_custom_info_length_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CUSTOM_INFO_LENGTH_ERROR</h6></div>

~~~java
 static final DJICameraError CUSTOM_INFO_LENGTH_ERROR = new DJICameraError("Custom info should not be null and no more than 32 bytes.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Custom info should not be null and no more than 32 bytes.

</div>

<div class="api-row" id="djierror_djicameraerror_cannot_set_parameters_in_super_resolution_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djicameraerror_cannot_set_parameters_in_super_resolution_state_inline">CANNOT_SET_PARAMETERS_IN_SUPER_RESOLUTION_STATE</a></div></div><div class="inline-doc" id="djierror_djicameraerror_cannot_set_parameters_in_super_resolution_state_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_SET_PARAMETERS_IN_SUPER_RESOLUTION_STATE</h6></div>

~~~java
 static final DJICameraError CANNOT_SET_PARAMETERS_IN_SUPER_RESOLUTION_STATE = new DJICameraError("Cannot set the parameters in Super Resolution state.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Cannot set the parameters in Super Resolution state.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_sdcardnotinserted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_sdcardnotinserted_inline">SD_CARD_NOT_INSERTED</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_sdcardnotinserted_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SD_CARD_NOT_INSERTED</h6></div>

~~~java
 static final DJICameraError SD_CARD_NOT_INSERTED = new DJICameraError("Camera has no SD Card")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No SD card.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_sdcardfull"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_sdcardfull_inline">SD_CARD_FULL</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_sdcardfull_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SD_CARD_FULL</h6></div>

~~~java
 static final DJICameraError SD_CARD_FULL = new DJICameraError("The Camera's SD Card is full")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">SD card full.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_sdcarderror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_sdcarderror_inline">SD_CARD_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_sdcarderror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SD_CARD_ERROR</h6></div>

~~~java
 static final DJICameraError SD_CARD_ERROR = new DJICameraError("Error accessing the SD Card")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">SD card error.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_sensorerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_sensorerror_inline">SENSOR_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_sensorerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SENSOR_ERROR</h6></div>

~~~java
 static final DJICameraError SENSOR_ERROR = new DJICameraError("Camera sensor error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Camera sensor error.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_systemerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_systemerror_inline">SYSTEM_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_systemerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SYSTEM_ERROR</h6></div>

~~~java
 static final DJICameraError SYSTEM_ERROR = new DJICameraError("Camera system error ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Camera system error.

</div>

<div class="api-row" id="djierror_djisdkcameraerror_nosuchmediafile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcameraerror_nosuchmediafile_inline">NO_SUCH_MEDIA_FILE</a></div></div><div class="inline-doc" id="djierror_djisdkcameraerror_nosuchmediafile_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_SUCH_MEDIA_FILE</h6></div>

~~~java
 static final DJICameraError NO_SUCH_MEDIA_FILE = new DJICameraError ("Media download result: no such file")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The media file is not found in SD card.

</div>



##### Inherited Methods:

<div class="api-row" id="djierror_djisdkflighthuberrorforcode"><div class="api-col left">dji.common.error.DJIError</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflighthuberrorforcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djisdkflighthuberrorforcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in the <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code> according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>errorCode for <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An NSError object initialized with errorCode. If the errorCode was 0, returns nil.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_djiutmisserrorforcodewitherrorcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserrorforcodewitherrorcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiutmisserrorforcodewitherrorcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Get DJIUTMISSError.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>An int value of error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_getdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_getdescription_inline">getDescription</a></div></div><div class="inline-doc" id="djierror_getdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of the error code.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The description of the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_setdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_setdescription_inline">setDescription</a></div></div><div class="inline-doc" id="djierror_setdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDescription</h6></div>

~~~java
 void setDescription(String desc) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Sets the description for the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">desc</td><td><font color="#666"><i>Description string.</i></td></tr></table></html></div>


