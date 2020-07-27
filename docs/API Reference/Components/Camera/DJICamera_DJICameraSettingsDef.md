<div class="article"><h1 ><font color="#AAA">class </font>SettingsDefinitions</h1></div>

~~~java
@EXClassNullAway
 class SettingsDefinitions 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class contains all the enums and setting classes for the DJI Camera.



##### Class Members:



##### Related:

<div class="api-row" id="djicamera_djilenstype"><div class="api-col left">Settings</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djilenstype_inline">LensType</a></div></div><div class="inline-doc" id="djicamera_djilenstype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LensType</h6></div>

~~~java
 enum LensType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Camera lens type. Only supported by Zenmuse H20/H20T.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djilenstype_zoom_inline"></a>ZOOM</td><td><font color="#666">Zoom lens.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djilenstype_wide_inline"></a>WIDE</td><td><font color="#666">Wide lens.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djilenstype_thermal_inline"></a>INFRARED_THERMAL</td><td><font color="#666">Infrared Thermal lens.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djilenstype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_multispectraldisplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_multispectraldisplaymode_inline">MultispectralDisplayMode</a></div></div><div class="inline-doc" id="djicamera_multispectraldisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MultispectralDisplayMode</h6></div>

~~~java
 enum MultispectralDisplayMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Display modes to coordinate the video feeds from both the RGB sensor and single-band sensors.  Only supported by multispectral camera of P4 Multispectral.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_multispectraldisplaymode_rgb_only_inline"></a>RGB_ONLY</td><td><font color="#666">Displays only the video feed from the RGB sensor.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_multispectraldisplaymode_ndvi_inline"></a>NDVI</td><td><font color="#666">Displays the NVDI (normalized difference vegetation index) frames as video feed produced by the multispectral camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_multispectraldisplaymode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The multispectral camera video feed display mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_spectrumband"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_spectrumband_inline">SpectrumBand</a></div></div><div class="inline-doc" id="djicamera_spectrumband_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SpectrumBand</h6></div>

~~~java
 enum SpectrumBand 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Enums represent the spectrum bands of a multispectral camera. For P4 Multispectral, the camera supports 5 bands.  Only supported by multispectral camera of P4 Multispectral.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_blue_inline"></a>BLUE</td><td><font color="#666">The blue spectrum.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_green_inline"></a>GREEN</td><td><font color="#666">The green spectrum.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_red_inline"></a>RED</td><td><font color="#666">The red spectrum.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_near_infrared_inline"></a>NEAR_INFRARED</td><td><font color="#666">The near infrared spectrum.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_red_edge_inline"></a>RED_EDGE</td><td><font color="#666">The red edge spectrum.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_spectrumband_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameramode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameramode_inline">CameraMode</a></div></div><div class="inline-doc" id="djicamera_djicameramode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CameraMode</h6></div>

~~~java
 enum CameraMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_key">CameraKey.MODE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_range_key">CameraKey.MODE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera work modes.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramodeshootphoto_inline"></a>SHOOT_PHOTO</td><td><font color="#666">Capture mode. In this mode, the user can capture pictures.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramoderecordvideo_inline"></a>RECORD_VIDEO</td><td><font color="#666">Record mode. In this mode, the user can record videos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramodeplayback_inline"></a>PLAYBACK</td><td><font color="#666">Playback mode. In this mode, the user can preview photos and videos, and can delete files. It is supported by Phantom 3 Professional camera, X3, X5 and X5R cameras on aircraft and Phantom 4 camera. Playback mode is not supported by Z30, X5S, X4S, Phantom 4 Pro, Mavic Pro, Phantom 3 Standard, Phantom 3 Advanced, Phantom 3 4K and Osmo series.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramodemediadownload_inline"></a>MEDIA_DOWNLOAD</td><td><font color="#666">In this mode, the user can download media to the Mobile Device. Not supported by X5 camera nor X5R camera while mounted on aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramodebroadcast_inline"></a>BROADCAST</td><td><font color="#666">In this mode, live stream resolution and frame rate will be 1080i50 (PAL) or 720p60 (NTSC). In this mode videos can be recorded. Still photos can also be taken only when video is recording. The only way to exit broadcast mode is to change modes to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>. Only supported by Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameramode_djicameramodeunknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera work mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerashootphotomode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerashootphotomode_inline">ShootPhotoMode</a></div></div><div class="inline-doc" id="djicamera_djicamerashootphotomode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ShootPhotoMode</h6></div>

~~~java
 enum ShootPhotoMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shoot_photo_mode_key">CameraKey.SHOOT_PHOTO_MODE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_shoot_photo_mode_range_key">CameraKey.SHOOT_PHOTO_MODE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">The ShootPhoto mode itself can have several modes. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode_djicamerashootphotomodesingle">SINGLE</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodesingle_inline"></a>SINGLE</td><td><font color="#666">Sets the camera to take a single photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodehdr_inline"></a>HDR</td><td><font color="#666">Sets the camera to take an HDR photo. X5 camera, X5R camera, XT camera, Z30 camera, Phantom 4 Pro camera, X4S camera and X5S camera do not support HDR mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeburst_inline"></a>BURST</td><td><font color="#666">Set the camera to take multiple photos at once. XT camera does not support Burst mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeaeb_inline"></a>AEB</td><td><font color="#666">Automatic Exposure Bracketing (AEB) capture. In this mode you can quickly take multiple shots (the default is 3) at different exposures without having to manually change any settings between frames. XT camera and Z30 camera does not support AEB mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeinterval_inline"></a>INTERVAL</td><td><font color="#666">Sets the camera to take a picture (or multiple pictures) continuously at a set time interval. The minimum interval for JPEG format of any quality is 2s. For all cameras except X4S, X5S and Phantom 4 Pro camera: The minimum interval for RAW or RAW+JPEG format is 10s. For the X4S, X5S and Phantom 4 Pro cameras the minimum interval for RAW or RAW+JPEG dformat is 5s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodetimelapse_inline"></a>TIME_LAPSE</td><td><font color="#666">Sets the camera to take a picture (or multiple pictures) continuously at a set time interval. The camera will merge the photo sequence and the output is a video. The minimum interval for Video only format is 1 s. The minimum interval for Video+Photo format is 2 s. For the new Osmo firmware version, no video feed will be received if the camera is shooting photos with Time-lapse mode. Instead, user can receive a sequence of preview images using the delegate method <code><a href="/Components/Camera/DJICamera_CameraGeneratedTimeLapsePreviewCallbackInterface.html#djicamera_didgeneratetimelapsepreview">onGenerate</a></code>. Supported only by Osmo camera (Z3 and X3).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodepanorama_inline"></a>PANORAMA</td><td><font color="#666">In panorama mode, the aircraft takes a series of photos with different gimbal and aircraft heading positions. The photos can be stitched with a third-party library. It is supported by Spark, Mavic Air, Mavic 2, Mavic 2 Pro, Mavic 2 Zoom, Mavic 2 Eneterprise, Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeehdr_inline"></a>EHDR</td><td><font color="#666">Sets the camera to take an enhanced-HDR photo. It blends a sequence of photos for ghost-free high dynamic range photos. It is supported by Mavic 2 Zoom and Mavic 2 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodehyperlight_inline"></a>HYPER_LIGHT</td><td><font color="#666">Sets the camera to take photos in HyperLight mode. It is a setting for low-light environment to enhance the photo quality while reducing noise significantly.  It is supported by Mavic 2 Zoom and Mavic 2 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomoderawburst_inline"></a>RAW_BURST</td><td><font color="#666">Sets the camera to take a burst of RAW photos. Use <code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_rawphotoburstcount">getRAWPhotoBurstCount</a></code> to check how many photos have been shot. Only supported by X5S.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeshallowfocus_inline"></a>SHALLOW_FOCUS</td><td><font color="#666">Sets the camera to take a series of photos while the aircraft moves up and down automatically. The image's depth of field can be computed with a third-party library to produce a photo with the bokeh effect. Note: <br> 1. It is only suitable for shooting still scenes. <br> 2. The aircraft will ascend about 20cm before shooting. Ensure that there is no obstacle about the aircraft. <br> 3. The suitable range of shooting is within 30m. <br> It is only supported by Spark.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashootphotomode_djicamerashootphotomodeunknown_inline"></a>UNKNOWN</td><td><font color="#666">The shoot photo mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraexposuremode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposuremode_inline">ExposureMode</a></div></div><div class="inline-doc" id="djicamera_djicameraexposuremode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ExposureMode</h6></div>

~~~java
 enum ExposureMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_mode_key">CameraKey.EXPOSURE_MODE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_mode_range_key">CameraKey.EXPOSURE_MODE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera exposure modes. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_program">PROGRAM</a></code>. The different exposure modes define whether Aperture, Shutter Speed, ISO can be set automatically or manually. Exposure compensation can be changed in all modes except Manual mode where it is not settable. <br>X5, X5R, Phantom 4 Pro camera, X4S and X5S:<br> Program Mode:       Shutter: Auto     Aperture: Auto     ISO: Manual or Auto<br> Shutter Priority: Shutter: Manual   Aperture: Auto     ISO: Manual or Auto<br> Aperture Priority:  Shutter: Auto     Aperture: Manual ISO: Manual or Auto<br> Manual Mode:        Shutter: Manual   Aperture: Manual   ISO: Manual<br><br><br>All other cameras:</b><br> Program Mode:       Shutter: Auto     Aperture: Fixed    ISO: Auto<br> Shutter Priority: Shutter: Manual   Aperture: Fixed    ISO: Auto<br> Aperture Priority:  NA<br> Manual Mode:        Shutter: Manual Aperture: Manual   ISO: Manual



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuremode_program_inline"></a>PROGRAM</td><td><font color="#666">Program mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuremode_shutter_inline"></a>SHUTTER_PRIORITY</td><td><font color="#666">Shutter priority mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuremode_aperture_inline"></a>APERTURE_PRIORITY</td><td><font color="#666">Aperture priority mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuremode_manual_inline"></a>MANUAL</td><td><font color="#666">Manual mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuremode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera exposure mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerashutterspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerashutterspeed_inline">ShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_djicamerashutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ShutterSpeed</h6></div>

~~~java
 enum ShutterSpeed 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shutter_speed_key">CameraKey.SHUTTER_SPEED</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_shutter_speed_range_key">CameraKey.SHUTTER_SPEED_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera's shutter speed options.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_20000_inline"></a>SHUTTER_SPEED_1_20000</td><td><font color="#666">Camera's shutter speed 1/20000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_16000_inline"></a>SHUTTER_SPEED_1_16000</td><td><font color="#666">Camera's shutter speed 1/16000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_12800_inline"></a>SHUTTER_SPEED_1_12800</td><td><font color="#666">Camera's shutter speed 1/12800 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_10000_inline"></a>SHUTTER_SPEED_1_10000</td><td><font color="#666">Camera's shutter speed 1/10000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_8000_inline"></a>SHUTTER_SPEED_1_8000</td><td><font color="#666">Camera's shutter speed 1/8000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_6400_inline"></a>SHUTTER_SPEED_1_6400</td><td><font color="#666">Camera's shutter speed 1/6400 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_6000_inline"></a>SHUTTER_SPEED_1_6000</td><td><font color="#666">Camera's shutter speed 1/6000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_5000_inline"></a>SHUTTER_SPEED_1_5000</td><td><font color="#666">Camera's shutter speed 1/5000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_4000_inline"></a>SHUTTER_SPEED_1_4000</td><td><font color="#666">Camera's shutter speed 1/4000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_3200_inline"></a>SHUTTER_SPEED_1_3200</td><td><font color="#666">Camera's shutter speed 1/3200 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_3000_inline"></a>SHUTTER_SPEED_1_3000</td><td><font color="#666">Camera's shutter speed 1/3000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_2500_inline"></a>SHUTTER_SPEED_1_2500</td><td><font color="#666">Camera's shutter speed 1/2500 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_2000_inline"></a>SHUTTER_SPEED_1_2000</td><td><font color="#666">Camera's shutter speed 1/2000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1600_inline"></a>SHUTTER_SPEED_1_1600</td><td><font color="#666">Camera's shutter speed 1/1600 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1500_inline"></a>SHUTTER_SPEED_1_1500</td><td><font color="#666">Camera's shutter speed 1/1500 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1250_inline"></a>SHUTTER_SPEED_1_1250</td><td><font color="#666">Camera's shutter speed 1/1250 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1000_inline"></a>SHUTTER_SPEED_1_1000</td><td><font color="#666">Camera's shutter speed 1/1000 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_800_inline"></a>SHUTTER_SPEED_1_800</td><td><font color="#666">Camera's shutter speed 1/800 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_725_inline"></a>SHUTTER_SPEED_1_725</td><td><font color="#666">Camera's shutter speed 1/725 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_640_inline"></a>SHUTTER_SPEED_1_640</td><td><font color="#666">Camera's shutter speed 1/640 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_500_inline"></a>SHUTTER_SPEED_1_500</td><td><font color="#666">Camera's shutter speed 1/500 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_400_inline"></a>SHUTTER_SPEED_1_400</td><td><font color="#666">Camera's shutter speed 1/400 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_350_inline"></a>SHUTTER_SPEED_1_350</td><td><font color="#666">Camera's shutter speed 1/350 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_320_inline"></a>SHUTTER_SPEED_1_320</td><td><font color="#666">Camera's shutter speed 1/320 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_250_inline"></a>SHUTTER_SPEED_1_250</td><td><font color="#666">Camera's shutter speed 1/250 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_240_inline"></a>SHUTTER_SPEED_1_240</td><td><font color="#666">Camera's shutter speed 1/240 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_200_inline"></a>SHUTTER_SPEED_1_200</td><td><font color="#666">Camera's shutter speed 1/200 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_180_inline"></a>SHUTTER_SPEED_1_180</td><td><font color="#666">Camera's shutter speed 1/180 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_160_inline"></a>SHUTTER_SPEED_1_160</td><td><font color="#666">Camera's shutter speed 1/160 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_125_inline"></a>SHUTTER_SPEED_1_125</td><td><font color="#666">Camera's shutter speed 1/125 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_120_inline"></a>SHUTTER_SPEED_1_120</td><td><font color="#666">Camera's shutter speed 1/120 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_100_inline"></a>SHUTTER_SPEED_1_100</td><td><font color="#666">Camera's shutter speed 1/100 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_90_inline"></a>SHUTTER_SPEED_1_90</td><td><font color="#666">Camera's shutter speed 1/90 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_80_inline"></a>SHUTTER_SPEED_1_80</td><td><font color="#666">Camera's shutter speed 1/80 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_60_inline"></a>SHUTTER_SPEED_1_60</td><td><font color="#666">Camera's shutter speed 1/60 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_50_inline"></a>SHUTTER_SPEED_1_50</td><td><font color="#666">Camera's shutter speed 1/50 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_40_inline"></a>SHUTTER_SPEED_1_40</td><td><font color="#666">Camera's shutter speed 1/40 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_30_inline"></a>SHUTTER_SPEED_1_30</td><td><font color="#666">Camera's shutter speed 1/30 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_25_inline"></a>SHUTTER_SPEED_1_25</td><td><font color="#666">Camera's shutter speed 1/25 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_20_inline"></a>SHUTTER_SPEED_1_20</td><td><font color="#666">Camera's shutter speed 1/20 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_15_inline"></a>SHUTTER_SPEED_1_15</td><td><font color="#666">Camera's shutter speed 1/15 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_12p5_inline"></a>SHUTTER_SPEED_1_12_DOT_5</td><td><font color="#666">Camera's shutter speed 1/12.5 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_10_inline"></a>SHUTTER_SPEED_1_10</td><td><font color="#666">Camera's shutter speed 1/10 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_8_inline"></a>SHUTTER_SPEED_1_8</td><td><font color="#666">Camera's shutter speed 1/8 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_6p25_inline"></a>SHUTTER_SPEED_1_6_DOT_25</td><td><font color="#666">Camera's shutter speed 1/6.25 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_5_inline"></a>SHUTTER_SPEED_1_5</td><td><font color="#666">Camera's shutter speed 1/5 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_4_inline"></a>SHUTTER_SPEED_1_4</td><td><font color="#666">Camera's shutter speed 1/4 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_3_inline"></a>SHUTTER_SPEED_1_3</td><td><font color="#666">Camera's shutter speed 1/3 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_2p5_inline"></a>SHUTTER_SPEED_1_2_DOT_5</td><td><font color="#666">Camera's shutter speed 1/2.5 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_2_inline"></a>SHUTTER_SPEED_1_2</td><td><font color="#666">Camera's shutter speed 1/2 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1p67_inline"></a>SHUTTER_SPEED_1_1_DOT_67</td><td><font color="#666">Camera's shutter speed 1/1.67 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1_1p25_inline"></a>SHUTTER_SPEED_1_1_DOT_25</td><td><font color="#666">Camera's shutter speed 1/1.25 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1p0_inline"></a>SHUTTER_SPEED_1</td><td><font color="#666">Camera's shutter speed 1.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1p3_inline"></a>SHUTTER_SPEED_1_DOT_3</td><td><font color="#666">Camera's shutter speed 1.3 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_1p6_inline"></a>SHUTTER_SPEED_1_DOT_6</td><td><font color="#666">Camera's shutter speed 1.6 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_2p0_inline"></a>SHUTTER_SPEED_2</td><td><font color="#666">Camera's shutter speed 2.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_2p5_inline"></a>SHUTTER_SPEED_2_DOT_5</td><td><font color="#666">Camera's shutter speed 2.5 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_3p0_inline"></a>SHUTTER_SPEED_3</td><td><font color="#666">Camera's shutter speed 3.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_3p2_inline"></a>SHUTTER_SPEED_3_DOT_2</td><td><font color="#666">Camera's shutter speed 3.2 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_4p0_inline"></a>SHUTTER_SPEED_4</td><td><font color="#666">Camera's shutter speed 4.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_5p0_inline"></a>SHUTTER_SPEED_5</td><td><font color="#666">Camera's shutter speed 5.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_6p0_inline"></a>SHUTTER_SPEED_6</td><td><font color="#666">Camera's shutter speed 6.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_7p0_inline"></a>SHUTTER_SPEED_7</td><td><font color="#666">Camera's shutter speed 7.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_8p0_inline"></a>SHUTTER_SPEED_8</td><td><font color="#666">Camera's shutter speed 8.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_9p0_inline"></a>SHUTTER_SPEED_9</td><td><font color="#666">Camera's shutter speed 9.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_10p0_inline"></a>SHUTTER_SPEED_10</td><td><font color="#666">Camera's shutter speed 10.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_13p0_inline"></a>SHUTTER_SPEED_13</td><td><font color="#666">Camera's shutter speed 13.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_15p0_inline"></a>SHUTTER_SPEED_15</td><td><font color="#666">Camera's shutter speed 15.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_20p0_inline"></a>SHUTTER_SPEED_20</td><td><font color="#666">Camera's shutter speed 20.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_25p0_inline"></a>SHUTTER_SPEED_25</td><td><font color="#666">Camera's shutter speed 25.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_30p0_inline"></a>SHUTTER_SPEED_30</td><td><font color="#666">Camera's shutter speed 30.0 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerashutterspeed_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Camera's shutter speed unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraiso"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraiso_inline">ISO</a></div></div><div class="inline-doc" id="djicamera_djicameraiso_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ISO</h6></div>

~~~java
 enum ISO 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_iso_key">CameraKey.ISO</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_iso_range_key">CameraKey.ISO_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera ISO values.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_auto_inline"></a>AUTO</td><td><font color="#666">The ISO value is automatically set. This cannot be used for all cameras when in Manual mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_50_inline"></a>ISO_50</td><td><font color="#666">The ISO value is set to 50.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_100_inline"></a>ISO_100</td><td><font color="#666">The ISO value is set to 100.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_200_inline"></a>ISO_200</td><td><font color="#666">The ISO value is set to 200.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_400_inline"></a>ISO_400</td><td><font color="#666">The ISO value is set to 400.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_800_inline"></a>ISO_800</td><td><font color="#666">The ISO value is set to 800.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_1600_inline"></a>ISO_1600</td><td><font color="#666">The ISO value is set to 1600.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_3200_inline"></a>ISO_3200</td><td><font color="#666">The ISO value is set to 3200.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_6400_inline"></a>ISO_6400</td><td><font color="#666">The ISO value is set to 6400.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_12800_inline"></a>ISO_12800</td><td><font color="#666">The ISO value is set to 12800.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_25600_inline"></a>ISO_25600</td><td><font color="#666">The ISO value is set to 25600.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_fixed_inline"></a>FIXED</td><td><font color="#666">ISO value is fixed by the camera firmware. When the camera color is set to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_dlog">D_LOG</a></code>, camera will fix the ISO to a specific value in order to optimize the performance. The value set by camera can be accessed from <code><a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html#djicamera_djicameraexposureparameters_iso">getISO</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraiso_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The ISO value is set to Unknown value.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraaperture"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraaperture_inline">Aperture</a></div></div><div class="inline-doc" id="djicamera_djicameraaperture_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Aperture</h6></div>

~~~java
 enum Aperture 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_aperture_key">CameraKey.APERTURE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_aperture_range_key">CameraKey.APERTURE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera aperture values. X5, X5R, Z30, Phantom 4 Pro camera, X4S and X5S support this setting.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f1p6_inline"></a>F_1_DOT_6</td><td><font color="#666">The Aperture value is f/1.6. It is only supported by Z30 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f1p7_inline"></a>F_1_DOT_7</td><td><font color="#666">The Aperture value is f/1.7.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f1p8_inline"></a>F_1_DOT_8</td><td><font color="#666">The Aperture value is f/1.8.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p0_inline"></a>F_2</td><td><font color="#666">The Aperture value is f/2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p2_inline"></a>F_2_DOT_2</td><td><font color="#666">The Aperture value is f/2.2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p4_inline"></a>F_2_DOT_4</td><td><font color="#666">The Aperture value is f/2.4. It is only supported by Z30 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p5_inline"></a>F_2_DOT_5</td><td><font color="#666">The Aperture value is f/2.5.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p6_inline"></a>F_2_DOT_6</td><td><font color="#666">The Aperture value is f/2.6.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f2p8_inline"></a>F_2_DOT_8</td><td><font color="#666">The Aperture value is f/2.8.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f3p2_inline"></a>F_3_DOT_2</td><td><font color="#666">The Aperture value is f/3.2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f3p4_inline"></a>F_3_DOT_4</td><td><font color="#666">The Aperture value is f/3.4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f3p5_inline"></a>F_3_DOT_5</td><td><font color="#666">The Aperture value is f/3.5.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f4p0_inline"></a>F_4</td><td><font color="#666">The Aperture value is f/4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f4p5_inline"></a>F_4_DOT_5</td><td><font color="#666">The Aperture value is f/4.5.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f4p8_inline"></a>F_4_DOT_8</td><td><font color="#666">The Aperture value is f/4.8.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f5p0_inline"></a>F_5</td><td><font color="#666">The Aperture value is f/5.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f5p6_inline"></a>F_5_DOT_6</td><td><font color="#666">The Aperture value is f/5.6.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f6p3_inline"></a>F_6_DOT_3</td><td><font color="#666">The Aperture value is f/6.3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f6p8_inline"></a>F_6_DOT_8</td><td><font color="#666">The Aperture value is f/6.8.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f7p1_inline"></a>F_7_DOT_1</td><td><font color="#666">The Aperture value is f/7.1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f8p0_inline"></a>F_8</td><td><font color="#666">The Aperture value is f/8.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f9p0_inline"></a>F_9</td><td><font color="#666">The Aperture value is f/9.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f9p6_inline"></a>F_9_DOT_6</td><td><font color="#666">The Aperture value is f/9.6.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f10_inline"></a>F_10</td><td><font color="#666">The Aperture value is f/10.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f11_inline"></a>F_11</td><td><font color="#666">The Aperture value is f/11.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f13_inline"></a>F_13</td><td><font color="#666">The Aperture value is f/13.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f14_inline"></a>F_14</td><td><font color="#666">The Aperture value is f/14.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f16_inline"></a>F_16</td><td><font color="#666">The Aperture value is f/16.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f18_inline"></a>F_18</td><td><font color="#666">The Aperture value is f/18.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f19_inline"></a>F_19</td><td><font color="#666">The Aperture value is f/19.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f20_inline"></a>F_20</td><td><font color="#666">The Aperture value is f/20.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_f22_inline"></a>F_22</td><td><font color="#666">The Aperture value is f/22.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraaperture_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The Aperture value is Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerawhitebalance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawhitebalance_inline">WhiteBalancePreset</a></div></div><div class="inline-doc" id="djicamera_djicamerawhitebalance_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WhiteBalancePreset</h6></div>

~~~java
 enum WhiteBalancePreset 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_white_balance_key">CameraKey.WHITE_BALANCE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_white_balance_present_range_key">CameraKey.WHITE_BALANCE_PRESENT_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera white balance. The default value is Auto.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_auto_inline"></a>AUTO</td><td><font color="#666">The camera's white balance is automatically set.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_sunny_inline"></a>SUNNY</td><td><font color="#666">The camera's white balance is set to sunny.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_cloudy_inline"></a>CLOUDY</td><td><font color="#666">The camera's white balance is set to cloudy.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_watersuface_inline"></a>WATER_SURFACE</td><td><font color="#666">The camera's white balance is set to water surface.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_indoorsincandescent_inline"></a>INDOOR_INCANDESCENT</td><td><font color="#666">The camera's white balance is set to indoors and incandescent light.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_indoorsfluorescent_inline"></a>INDOOR_FLUORESCENT</td><td><font color="#666">The camera's white balance is set to indoors and fluorescent light.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_customcolortemperature_inline"></a>CUSTOM</td><td><font color="#666">The camera's white balance is set to custom color temperature. By using this white balance value, user can set a specific value for the color temperature.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's white balance is unknown.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerawhitebalance_neutral_inline"></a>PRESET_NEUTRAL</td><td><font color="#666">The camera's white balance is set to neutral. It is only supported by the X7.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerameteringmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerameteringmode_inline">MeteringMode</a></div></div><div class="inline-doc" id="djicamera_djicamerameteringmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MeteringMode</h6></div>

~~~java
 enum MeteringMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_metering_mode_key">CameraKey.METERING_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera exposure metering. The default value is Center.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerameteringmode_center_inline"></a>CENTER</td><td><font color="#666">The camera's exposure metering is set to the center.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerameteringmode_average_inline"></a>AVERAGE</td><td><font color="#666">The camera's exposure metering is set to average.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerameteringmode_spot_inline"></a>SPOT</td><td><font color="#666">The camera's exposure metering is set to a single spot.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerameteringmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's exposure metering is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraexposurecompensation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposurecompensation_inline">ExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_djicameraexposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ExposureCompensation</h6></div>

~~~java
 enum ExposureCompensation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_compensation_key">CameraKey.EXPOSURE_COMPENSATION</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_compensation_range_key">CameraKey.EXPOSURE_COMPENSATION_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera exposure compensation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n50_inline"></a>N_5_0</td><td><font color="#666">The camera's exposure compensation is -5.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n47_inline"></a>N_4_7</td><td><font color="#666">The camera's exposure compensation is -4.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n43_inline"></a>N_4_3</td><td><font color="#666">The camera's exposure compensation is -4.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n40_inline"></a>N_4_0</td><td><font color="#666">The camera's exposure compensation is -4.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n37_inline"></a>N_3_7</td><td><font color="#666">The camera's exposure compensation is -3.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n33_inline"></a>N_3_3</td><td><font color="#666">The camera's exposure compensation is -3.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n30_inline"></a>N_3_0</td><td><font color="#666">The camera's exposure compensation is -3.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n27_inline"></a>N_2_7</td><td><font color="#666">The camera's exposure compensation is -2.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n23_inline"></a>N_2_3</td><td><font color="#666">The camera's exposure compensation is -2.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n20_inline"></a>N_2_0</td><td><font color="#666">The camera's exposure compensation is -2.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n17_inline"></a>N_1_7</td><td><font color="#666">The camera's exposure compensation is -1.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n13_inline"></a>N_1_3</td><td><font color="#666">The camera's exposure compensation is -1.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n10_inline"></a>N_1_0</td><td><font color="#666">The camera's exposure compensation is -1.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n07_inline"></a>N_0_7</td><td><font color="#666">The camera's exposure compensation is -0.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n03_inline"></a>N_0_3</td><td><font color="#666">The camera's exposure compensation is -0.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_n00_inline"></a>N_0_0</td><td><font color="#666">The camera's exposure compensation is 0.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p03_inline"></a>P_0_3</td><td><font color="#666">The camera's exposure compensation is +0.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p07_inline"></a>P_0_7</td><td><font color="#666">The camera's exposure compensation is +0.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p10_inline"></a>P_1_0</td><td><font color="#666">The camera's exposure compensation is +1.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p13_inline"></a>P_1_3</td><td><font color="#666">The camera's exposure compensation is +1.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p17_inline"></a>P_1_7</td><td><font color="#666">The camera's exposure compensation is +1.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p20_inline"></a>P_2_0</td><td><font color="#666">The camera's exposure compensation is +2.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p23_inline"></a>P_2_3</td><td><font color="#666">The camera's exposure compensation is +2.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p27_inline"></a>P_2_7</td><td><font color="#666">The camera's exposure compensation is +2.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p30_inline"></a>P_3_0</td><td><font color="#666">The camera's exposure compensation is +3.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p33_inline"></a>P_3_3</td><td><font color="#666">The camera's exposure compensation is +3.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p37_inline"></a>P_3_7</td><td><font color="#666">The camera's exposure compensation is +3.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p40_inline"></a>P_4_0</td><td><font color="#666">The camera's exposure compensation is +4.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p43_inline"></a>P_4_3</td><td><font color="#666">The camera's exposure compensation is +4.3ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p47_inline"></a>P_4_7</td><td><font color="#666">The camera's exposure compensation is +4.7ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_p50_inline"></a>P_5_0</td><td><font color="#666">The camera's exposure compensation is +5.0ev.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_fixed_inline"></a>FIXED</td><td><font color="#666">The camera's exposure compensation is fixed by the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurecompensation_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's exposure compensation is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraexposureparameters"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html">ExposureSettings</a></div></div><div class="api-row" id="djicamera_djicameradisplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaymode_inline">DisplayMode</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DisplayMode</h6></div>

~~~java
 enum DisplayMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_display_mode_key">CameraKey.DISPLAY_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Display modes to coordinate the video feeds from both the visual camera and the thermal camera. Only supported by XT2 camera and and Mavic 2 Enterprise Dual Camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradisplaymode_visualonly_inline"></a>VISUAL_ONLY</td><td><font color="#666">Displays only the video feed from the visual camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradisplaymode_thermalonly_inline"></a>THERMAL_ONLY</td><td><font color="#666">Displays only the video feed from the thermal camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradisplaymode_pip_inline"></a>PIP</td><td><font color="#666">Displays the video feed from the visual camera as the main subject, and the video  from the thermal camera in a window not bigger than the main subject. The position  of the thermal camera window can be adjusted with <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerapipposition">PIPPosition</a></code>.  Not supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradisplaymode_msx_inline"></a>MSX</td><td><font color="#666">Multi-Spectral Dynamic Imaging. Fuse the video feeds from both the visual camera and the  thermal camera as one. Adds visible spectrum definition to IR images by detecting the edges  of objects and including that detail in the thermal image.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradisplaymode_unknown_inline"></a>OTHER</td><td><font color="#666">The thermal video feed display mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerapipposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerapipposition_inline">PIPPosition</a></div></div><div class="inline-doc" id="djicamera_djicamerapipposition_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PIPPosition</h6></div>

~~~java
 enum PIPPosition 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_pip_position_key">CameraKey.PIP_POSITION</a></td></tr></table></html>



##### Description:



<font color="#666">Possible positions to place the window of the thermal camera video feed when the display mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode_pip">PIP</a></code>. Only supported by XT2 camera and Mavic 2 Enterprise Dual Light Camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_center_inline"></a>IR_CENTER</td><td><font color="#666">Position the window to the vertical center and the horizontal center.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_bottomright_inline"></a>IR_BOTTOM_RIGHT</td><td><font color="#666">Position the window to be bottom right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_centerright_inline"></a>IR_CENTER_RIGHT</td><td><font color="#666">Position the window to be centered on the right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_topright_inline"></a>IR_TOP_RIGHT</td><td><font color="#666">Position the window to be top right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_bottomcenter_inline"></a>IR_BOTTOM_CENTER</td><td><font color="#666">Position the window to be centered at bottom.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_topcenter_inline"></a>IR_TOP_CENTER</td><td><font color="#666">Position the window to be centered at top.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_bottomleft_inline"></a>IR_BOTTOM_LEFT</td><td><font color="#666">Position the window to be bottom left.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_centerleft_inline"></a>IR_CENTER_LEFT</td><td><font color="#666">Position the window to be centered on the left.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_topleft_inline"></a>IR_TOP_LEFT</td><td><font color="#666">Position the window to be top left.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_sidebyside_inline"></a>SIDE_BY_SIDE</td><td><font color="#666">Position the thermal window on the right side of the main  window (the visual camera video feed). Scale both windows  with the same height.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_align_inline"></a>ALIGN</td><td><font color="#666">Position the thermal window on top of the main window (the  visual camera video feed). Then align the object in the thermal  window with the same object in the main window. The alignment  offset can be adjusted by <code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setdualfeedhorizontalalignmentoffset">setDualFeedHorizontalAlignmentOffset</a></code>  and <code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setdualfeedverticalalignmentoffset">setDualFeedVerticalAlignmentOffset</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapipposition_unknown_inline"></a>OTHER</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraopticalzoomspec"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html">OpticalZoomSpec</a></div></div><div class="api-row" id="djicamera_djicameraopticalzoomdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraopticalzoomdirection_inline">ZoomDirection</a></div></div><div class="inline-doc" id="djicamera_djicameraopticalzoomdirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ZoomDirection</h6></div>

~~~java
 enum ZoomDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_start_continuous_optical_zoom_key">CameraKey.START_CONTINUOUS_OPTICAL_ZOOM</a></td></tr></table></html>



##### Description:



<font color="#666">The direction to adjust the camera zoom (camera focal length). Supported by X5, X5R and X5S with zoom lens, Z3 camera and Z30 camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomdirection_zoomin_inline"></a>ZOOM_IN</td><td><font color="#666">Lens will zoom in. The focal length increases, field of view becomes narrower and magnification is higher.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomdirection_zoomout_inline"></a>ZOOM_OUT</td><td><font color="#666">Lens will zoom out. The focal length decreases, field of view becomes wider and magnification is lower.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerahybridzoomspec"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html">HybridZoomSpec</a></div></div><div class="api-row" id="djicamera_djicameraopticalzoomspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraopticalzoomspeed_inline">ZoomSpeed</a></div></div><div class="inline-doc" id="djicamera_djicameraopticalzoomspeed_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ZoomSpeed</h6></div>

~~~java
 enum ZoomSpeed 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_start_continuous_optical_zoom_key">CameraKey.START_CONTINUOUS_OPTICAL_ZOOM</a></td></tr></table></html>



##### Description:



<font color="#666">The speed of lens to zoom. The speed of lens to zoom. Supported by X5, X5R and X5S with zoom lens, Z3 camera and Z30 camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_slowest_inline"></a>SLOWEST</td><td><font color="#666">Lens zooms very in slowest speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_slow_inline"></a>SLOW</td><td><font color="#666">Lens zooms in slow speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_moderatelyslow_inline"></a>MODERATELY_SLOW</td><td><font color="#666">Lens zooms in speed slightly slower than normal speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_normal_inline"></a>NORMAL</td><td><font color="#666">Lens zooms in normal speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_moderatelyfast_inline"></a>MODERATELY_FAST</td><td><font color="#666">Lens zooms very in speed slightly faster than normal speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_fast_inline"></a>FAST</td><td><font color="#666">Lens zooms very in fast speed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraopticalzoomspeed_fastest_inline"></a>FASTEST</td><td><font color="#666">Lens zooms very in fastest speed.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameratapzoomstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameratapzoomstate_inline">TapZoomState</a></div></div><div class="inline-doc" id="djicamera_djicameratapzoomstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>TapZoomState</h6></div>

~~~java
 enum TapZoomState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The state of the tap zoom action. Only supported by Z30 camera. For Zenmuse H20 and Zenmuse H20T, please access the value through class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratapzoomstate_idle_inline"></a>IDLE</td><td><font color="#666">The tap zoom is not triggered yet. It will always push <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratapzoomstate_idle">IDLE</a></code> if camera is not zooming.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratapzoomstate_zoomin_inline"></a>ZOOM_IN</td><td><font color="#666">The camera is zooming in. The focal length increases, field of view becomes narrower and magnification is higher.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratapzoomstate_zoomout_inline"></a>ZOOM_OUT</td><td><font color="#666">The camera is zooming in the focal length decreases, field of view becomes wider and magnification is lower.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratapzoomstate_zoomlimited_inline"></a>ZOOM_LIMITED</td><td><font color="#666">It means the camera has reached its maximum focus length. It will always push <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratapzoomstate_zoomlimited">ZOOM_LIMITED</a></code>  if the camera reaches its maximum focus length.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameralensfocusmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensfocusmode_inline">FocusMode</a></div></div><div class="inline-doc" id="djicamera_djicameralensfocusmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FocusMode</h6></div>

~~~java
 enum FocusMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_mode_key">CameraKey.FOCUS_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera focus mode. It is settable only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code> and the physical AF switch on the camera is set to auto.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusmode_manual_inline"></a>MANUAL</td><td><font color="#666">The camera's focus mode is set to manual. In this mode, user sets the focus ring value to adjust the focal distance.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusmode_auto_inline"></a>AUTO</td><td><font color="#666">The camera's focus mode is set to auto. For the Z30 camera, the focus is calculated completely automatically. For all other cameras, a focus target can be set by the user, which is used to calculate focus automatically.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusmode_afc_inline"></a>AFC</td><td><font color="#666">The camera's focus mode is set to Continuous AF. It is only supported by Mavic Pro with firmware version V01.03.0000 or above, X4S camera, Mavic 2 Zoom camera and Mavic 2 Pro camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's focus mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameralensfocusstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensfocusstatus_inline">FocusStatus</a></div></div><div class="inline-doc" id="djicamera_djicameralensfocusstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FocusStatus</h6></div>

~~~java
 enum FocusStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_status_key">CameraKey.FOCUS_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">The focusing status of the camera's lens.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusstatus_idle_inline"></a>IDLE</td><td><font color="#666">The lens is idle. No focus target has been set.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusstatus_focusing_inline"></a>FOCUSING</td><td><font color="#666">The lens is focusing on the target.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusstatus_success_inline"></a>SUCCESSFUL</td><td><font color="#666">The lens succeeded to focus on the target.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusstatus_failure_inline"></a>FAILED</td><td><font color="#666">The lens failed to focus on the target. This happens when the target is too close, or the camera cannot distinguish the object to focus (e.g. a white wall).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameralensfocusstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The lens focus status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerasensorcleaningstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasensorcleaningstate_inline">SensorCleaningState</a></div></div><div class="inline-doc" id="djicamera_djicamerasensorcleaningstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SensorCleaningState</h6></div>

~~~java
 enum SensorCleaningState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sensor_cleaning_state_key">CameraKey.SENSOR_CLEANING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">The states of the sensor cleaning operation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_idle_inline"></a>IDLE</td><td><font color="#666">Not in sensor cleaning mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_initiating_inline"></a>INITIATING</td><td><font color="#666">The camera is initiating sensor cleaning mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_waitingforlensremoval_inline"></a>WAITING_FOR_LENS_REMOVAL</td><td><font color="#666">Remove the lens from the camera to continue cleaning operation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_ready_inline"></a>READY</td><td><font color="#666">The camera is ready to start the sensor cleaning. Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_startsensorcleaning">startSensorCleaning</a></code> to start the operation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_cleaning_inline"></a>CLEANING</td><td><font color="#666">The camera is executing sensor cleaning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_finishing_inline"></a>FINISHING</td><td><font color="#666">The sensor cleaning process is finishing. No action is required in this state and the state will change to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_waitingforlensremount">WAITING_FOR_LENS_REMOUNT</a></code> automatically.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_waitingforlensremount_inline"></a>WAITING_FOR_LENS_REMOUNT</td><td><font color="#666">The sensor cleaning is finished and the camera is waiting for the lens to be remounted. When the lens is mounted, the state will change to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_idle">IDLE</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasensorcleaningstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphotofileformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotofileformat_inline">PhotoFileFormat</a></div></div><div class="inline-doc" id="djicamera_djicameraphotofileformat_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoFileFormat</h6></div>

~~~java
 enum PhotoFileFormat 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_file_format_key">CameraKey.PHOTO_FILE_FORMAT</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_file_format_range_key">CameraKey.PHOTO_FILE_FORMAT_RANGE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_pano_original_images_format_range_key">CameraKey.PANO_ORIGINAL_IMAGES_FORMAT_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera photo file formats. The default value is JPEG.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_raw_inline"></a>RAW</td><td><font color="#666">The camera's photo storage format is RAW.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_jpeg_inline"></a>JPEG</td><td><font color="#666">The camera's photo storage format is JPEG.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_rawandjpeg_inline"></a>RAW_AND_JPEG</td><td><font color="#666">The camera stores both the RAW and JPEG formats of the photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_tiff14bit_inline"></a>TIFF_14_BIT</td><td><font color="#666">The camera's photo storage format is TIFF (14bit).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_radiometricjpeg_inline"></a>RADIOMETRIC_JPEG</td><td><font color="#666">The camera's photo storage format is Radiometric JPEG (a special JPEG format with temperature information). A radiometric JPEG has the .jpg suffix and can be viewed as a normal JPEG file would. At the same time, the temperature data is also stored in the file as meta data. PC software is required to analyze the file and it is accessible at FLIR's website http://www.flir.com/instruments/display/?id=54865. Only supported by XT camera with firmware version 1.16.1.70 or above.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_tiff14bitlinearlowtempresolution_inline"></a>TIFF_14_BIT_LINEAR_LOW_TEMP_RESOLUTION</td><td><font color="#666">The camera's photo storage format is TIFF Linear Low. In this mode each pixel is 14 bits and linearly proportional with temperature, covering a high dynamic range of temperature which results in a lower temperature resolution. Supported only by Zenmuse XT containing Advanced Radiometry capabilities with firmware version 1.17.1.80 or lower. For newer firmwares, the temperature resolution preference is coupled with the thermal gain mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_tiff14bitlinearhightempresolution_inline"></a>TIFF_14_BIT_LINEAR_HIGH_TEMP_RESOLUTION</td><td><font color="#666">The camera's photo storage format is TIFF Linear High. In this mode each pixel is 14 bits and linearly proportional with temperature, covering a low dynamic range of temperature which results in a higher temperature resolution. Supported only by Zenmuse XT containing Advanced Radiometry capabilities with firmware version 1.17.1.80 or lower. For newer firmwares, the temperature resolution preference is coupled with the thermal gain mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotofileformat_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's photo storage format is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphotoaspectratio"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotoaspectratio_inline">PhotoAspectRatio</a></div></div><div class="inline-doc" id="djicamera_djicameraphotoaspectratio_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoAspectRatio</h6></div>

~~~java
 enum PhotoAspectRatio 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aspect_ratio_key">CameraKey.PHOTO_ASPECT_RATIO</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aspect_ratio_range_key">CameraKey.PHOTO_ASPECT_RATIO_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Photo aspect ratio, where the first value is the width and the second value is the height. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio_4_3">RATIO_4_3</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaspectratio_4_3_inline"></a>RATIO_4_3</td><td><font color="#666">The camera's photo ratio is 4 : 3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaspectratio_16_9_inline"></a>RATIO_16_9</td><td><font color="#666">The camera's photo ratio is 16 : 9.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaspectratio_3_2_inline"></a>RATIO_3_2</td><td><font color="#666">The camera's photo ratio is 3:2. It is only supported by Phantom 4 Pro camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaspectratio_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's photo ratio is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphotoburstcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotoburstcount_inline">PhotoBurstCount</a></div></div><div class="inline-doc" id="djicamera_djicameraphotoburstcount_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoBurstCount</h6></div>

~~~java
 enum PhotoBurstCount 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_burst_count_key">CameraKey.PHOTO_BURST_COUNT</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_raw_burst_count_key">CameraKey.PHOTO_RAW_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">The number of photos taken in one burst shot (shooting photo in burst mode).



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_2_inline"></a>BURST_COUNT_2</td><td><font color="#666">The camera burst shoot count is set to capture 2 pictures at once when the camera shoots a photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_3_inline"></a>BURST_COUNT_3</td><td><font color="#666">The camera burst shoot count is set to capture 3 pictures at once when the camera shoots a photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_5_inline"></a>BURST_COUNT_5</td><td><font color="#666">The camera burst shoot count is set to capture 5 pictures at once when the camera takes a photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_7_inline"></a>BURST_COUNT_7</td><td><font color="#666">The camera burst shoot count is set to capture 7 pictures at once when the camera takes a photo. It is not supported by Z30 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_10_inline"></a>BURST_COUNT_10</td><td><font color="#666">The camera burst shoot count is set to capture 10 pictures at once when the camera takes a photo. Only supported by X4S camera, X5S camera and Phantom 4 Pro camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_14_inline"></a>BURST_COUNT_14</td><td><font color="#666">The camera burst shoot count is set to capture 14 pictures at once when the camera takes a photo. Only supported by X4S camera, X5S camera and Phantom 4 Pro camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_continuous_inline"></a>CONTINUOUS</td><td><font color="#666">The camera burst shoot count is set to capture RAW pictures continuously until <code><a href="/Components/Camera/DJICamera.html#djicamera_stopshootphoto">stopShootPhoto</a></code> command is sent. It is only supported by Inspire 2 when the photo shoot mode is RAW burst.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoburstcount_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera burst shoot count value is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphototimelapsefileformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphototimelapsefileformat_inline">PhotoTimeLapseFileFormat</a></div></div><div class="inline-doc" id="djicamera_djicameraphototimelapsefileformat_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoTimeLapseFileFormat</h6></div>

~~~java
 enum PhotoTimeLapseFileFormat 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_lapse_settings_key">CameraKey.PHOTO_TIME_LAPSE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">File format for camera when it is in time-lapse mode. The default file format is video. If video+JPEG is selected the minimum interval will be 2 seconds.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphototimelapsefileformat_video_inline"></a>VIDEO</td><td><font color="#666">The camera in time-lapse mode will generate video.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphototimelapsefileformat_videoandjpeg_inline"></a>JPEG_AND_VIDEO</td><td><font color="#666">The camera in time-lapse mode will generate video and JPEG.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphototimelapsefileformat_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The file format is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphotointervalparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html">PhotoTimeIntervalSettings</a></div></div><div class="api-row" id="djicamera_djicameravideofileformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideofileformat_inline">VideoFileFormat</a></div></div><div class="inline-doc" id="djicamera_djicameravideofileformat_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoFileFormat</h6></div>

~~~java
 enum VideoFileFormat 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_format_key">CameraKey.VIDEO_FILE_FORMAT</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_format_range_key">CameraKey.VIDEO_FILE_FORMAT_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Video storage formats.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofileformat_mov_inline"></a>MOV</td><td><font color="#666">The video storage format is MOV.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofileformat_mp4_inline"></a>MP4</td><td><font color="#666">The video storage format is MP4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofileformat_tiffsequence_inline"></a>TIFF_SEQ</td><td><font color="#666">The video storage format is TIFF Sequence.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofileformat_seq_inline"></a>SEQ</td><td><font color="#666">The video storage format is SEQ. The raw data from the infrared camera is stored.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofileformat_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The video storage format is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameravideoresolution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoresolution_inline">VideoResolution</a></div></div><div class="inline-doc" id="djicamera_djicameravideoresolution_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoResolution</h6></div>

~~~java
 enum VideoResolution 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_resolution_frame_rate_range_key">CameraKey.VIDEO_RESOLUTION_FRAME_RATE_RANGE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_resolution_range_key">CameraKey.SSD_VIDEO_RESOLUTION_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera video resolution values. The resolutions available for a product are in <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange">videoResolutionAndFrameRateRange</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_336x256_inline"></a>RESOLUTION_336x256</td><td><font color="#666">The camera's video resolution is 336x256.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_640x360_inline"></a>RESOLUTION_640x360</td><td><font color="#666">The camera's video resolution is 640x360. Supported by Mavic 2 Enterprise Dual thermal camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_720x576_inline"></a>RESOLUTION_720x576</td><td><font color="#666">The camera's video resolution is 720x576.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_640x480_inline"></a>RESOLUTION_640x480</td><td><font color="#666">The camera's video resolution is 640x480.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_640x512_inline"></a>RESOLUTION_640x512</td><td><font color="#666">The camera's video resolution is 640x512.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_1280x720_inline"></a>RESOLUTION_1280x720</td><td><font color="#666">The camera's video resolution is 1280x720.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_1920x1080_inline"></a>RESOLUTION_1920x1080</td><td><font color="#666">The camera's video resolution is 1920x1080.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_2704x1520_inline"></a>RESOLUTION_2704x1520</td><td><font color="#666">The camera's video resolution is 2704x1520.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_2720x1530_inline"></a>RESOLUTION_2720x1530</td><td><font color="#666">The camera's video resolution is 2720x1530.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_3712x2088_inline"></a>RESOLUTION_3712x2088</td><td><font color="#666">The camera's video resolution is 3712x2088. It's only used by X7 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_3840x1572_inline"></a>RESOLUTION_3840x1572</td><td><font color="#666">The camera's video resolution is 3840x1572.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_3840x2160_inline"></a>RESOLUTION_3840x2160</td><td><font color="#666">The camera's video resolution is 3840x2160.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_3944x2088_inline"></a>RESOLUTION_3944x2088</td><td><font color="#666">The camera's video resolution is 3944x2088. It's only used by X7 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_4096x2160_inline"></a>RESOLUTION_4096x2160</td><td><font color="#666">The camera's video resolution is 4096x2160.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_4608x2160_inline"></a>RESOLUTION_4608x2160</td><td><font color="#666">The camera's video resolution is 4608x2160.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_4608x2592_inline"></a>RESOLUTION_4608x2592</td><td><font color="#666">The camera's video resolution is 4608x2592.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_5280x2160_inline"></a>RESOLUTION_5280x2160</td><td><font color="#666">The camera's video resolution is 5280x2160.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_5760x3240_inline"></a>RESOLUTION_5760X3240</td><td><font color="#666">The camera's video resolution is 5760x3240.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_6016x3200_inline"></a>RESOLUTION_6016X3200</td><td><font color="#666">The camera's video resolution is 6016x3200.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_maxresolution_inline"></a>RESOLUTION_MAX</td><td><font color="#666">The camera's video resolution will be maximum resolution supported by the camera sensor. For X5S and X4S, the maximum resolution is 5280x2972.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_nossdvideo_inline"></a>NO_SSD_VIDEO</td><td><font color="#666">The camera's SSD video resolution is unset. When the SSD resolution is unset, camera will not store video to SSD. SSD's resolution is determined by both license key and SD card's video frame rate. If there is no supported resolution with the current configuration, <code>DJICameraVideoResolutionUnset</code> will be selected and user should adjust either the license or the frame rate.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_2048x1080_inline"></a>RESOLUTION_2048x1080</td><td><font color="#666">The camera's video resolution is 2048x1080.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_2688x1512_inline"></a>RESOLUTION_2688x1512</td><td><font color="#666">The camera's video resolution is 2688x1512.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_5280x2972_inline"></a>RESOLUTION_5280x2972</td><td><font color="#666">The camera's video resolution is 5280x2972.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoresolution_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's video resolution is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameravideoframerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideoframerate_inline">VideoFrameRate</a></div></div><div class="inline-doc" id="djicamera_djicameravideoframerate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoFrameRate</h6></div>

~~~java
 enum VideoFrameRate 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_resolution_frame_rate_range_key">CameraKey.VIDEO_RESOLUTION_FRAME_RATE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera video frame rate values. The frame rates available for a product are in <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange">videoResolutionAndFrameRateRange</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_23p976fps_inline"></a>FRAME_RATE_23_DOT_976_FPS</td><td><font color="#666">The camera's video frame rate is 23.976fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_24fps_inline"></a>FRAME_RATE_24_FPS</td><td><font color="#666">The camera's video frame rate is 24fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_25fps_inline"></a>FRAME_RATE_25_FPS</td><td><font color="#666">The camera's video frame rate is 25fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_29p970fps_inline"></a>FRAME_RATE_29_DOT_970_FPS</td><td><font color="#666">The camera's video frame rate is 29.97fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_30fps_inline"></a>FRAME_RATE_30_FPS</td><td><font color="#666">The camera's video frame rate is 30fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_47p950fps_inline"></a>FRAME_RATE_47_DOT_950_FPS</td><td><font color="#666">The camera's video frame rate is 47.95fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_48fps_inline"></a>FRAME_RATE_48_FPS</td><td><font color="#666">The camera's video frame rate is 48fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_50fps_inline"></a>FRAME_RATE_50_FPS</td><td><font color="#666">The camera's video frame rate is 50fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_59p940fps_inline"></a>FRAME_RATE_59_DOT_940_FPS</td><td><font color="#666">The camera's video frame rate is 59.94fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_60fps_inline"></a>FRAME_RATE_60_FPS</td><td><font color="#666">The camera's video frame rate is 60fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_90fps_inline"></a>FRAME_RATE_90_FPS</td><td><font color="#666">The camera's video frame rate is 90fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_96fps_inline"></a>FRAME_RATE_96_FPS</td><td><font color="#666">The camera's video frame rate is 96fps (frames per second).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_100fps_inline"></a>FRAME_RATE_100_FPS</td><td><font color="#666">The camera's video frame rate is 100fps (frames per second). This frame rate can only be used when <code>isSlowMotionSupported</code> returns <code>true</code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_120fps_inline"></a>FRAME_RATE_120_FPS</td><td><font color="#666">The camera's video frame rate is 120fps (frames per second). This frame rate can only be used when <code>isSlowMotionSupported</code> returns <code>true</code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_8dot7fps_inline"></a>FRAME_RATE_8_DOT_7_FPS</td><td><font color="#666">The camera's video frame rate is 8.7fps (frames per second). Supported by Mavic 2 Enterprise Dual thermal camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideoframerate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's video frame rate is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameravideofov"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideofov_inline">VideoFov</a></div></div><div class="inline-doc" id="djicamera_djicameravideofov_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoFov</h6></div>

~~~java
 enum VideoFov 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">FOV (field-of-view) to use for recording a video.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofov_default_inline"></a>DEFAULT</td><td><font color="#666">The default FOV. Use this value if the FOV is not configurable for the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofov_narrow_inline"></a>NARROW</td><td><font color="#666">Use a narrow FOV to record videos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofov_wide_inline"></a>WIDE</td><td><font color="#666">Use a wide FOV to record videos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideofov_unknown_inline"></a>UNKNOWN</td><td><font color="#666">UNKNOWN</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameravideostandard"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideostandard_inline">VideoStandard</a></div></div><div class="inline-doc" id="djicamera_djicameravideostandard_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoStandard</h6></div>

~~~java
 enum VideoStandard 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_standard_key">CameraKey.VIDEO_STANDARD</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_standard_range_key">CameraKey.VIDEO_STANDARD_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Video standard values. The default value is NTSC. For Zenmuse H20 and H20T, please access the value through class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostandard_pal_inline"></a>PAL</td><td><font color="#666">The camera video standard value is set to PAL.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostandard_ntsc_inline"></a>NTSC</td><td><font color="#666">The camera video standard value is set to NTSC.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostandard_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera video standard value is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djivideofilecompressionstandard"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djivideofilecompressionstandard_inline">VideoFileCompressionStandard</a></div></div><div class="inline-doc" id="djicamera_djivideofilecompressionstandard_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoFileCompressionStandard</h6></div>

~~~java
 enum VideoFileCompressionStandard 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_compression_standard_key">CameraKey.VIDEO_FILE_COMPRESSION_STANDARD</a></td></tr></table></html>



##### Description:



<font color="#666">The compression standard used to store the video files. It is only supported X4S, X5S and Phantom 4 Pro cameras.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djivideofilecompressionstandard_h264_inline"></a>H264</td><td><font color="#666">H.264 compression standard.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djivideofilecompressionstandard_h265_inline"></a>H265</td><td><font color="#666">H.265 compression standard.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djivideofilecompressionstandard_unknown_inline"></a>Unknown</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerassdvideolicense"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdvideolicense_inline">CameraSSDVideoLicense</a></div></div><div class="inline-doc" id="djicamera_djicamerassdvideolicense_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CameraSSDVideoLicense</h6></div>

~~~java
@EXClassNullAway
 enum CameraSSDVideoLicense 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_activate_ssd_video_license_key">CameraKey.ACTIVATE_SSD_VIDEO_LICENSE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_licenses_key">CameraKey.SSD_VIDEO_LICENSES</a></td></tr></table></html>



##### Description:



<font color="#666">DJI camera's license keys. An Inspire 2 License Key activates the usage permission of CinemaDNG or Apple ProRes inside CineCore 2.0. License keys are obtained by by purchase from the DJI store website using the Inspire 2 serial number. The Inspire 2 is then connected to DJI Assistant 2, and the license keys downloaded to it. It is only supported X5S and X7 cameras.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideolicensecinemadng_inline"></a>LicenseKeyTypeCinemaDNG</td><td><font color="#666">CinemaDNG.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideolicenseprores422hq_inline"></a>LicenseKeyTypeProRes422HQ</td><td><font color="#666">Apple ProRes 422 HQ.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideolicenseprores4444xq_inline"></a>LicenseKeyTypeProRes4444XQ</td><td><font color="#666">Apple ProRes 4444 XQ(no alpha).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideolicenseunknown_inline"></a>Unknown</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerassdvideodigitalfilter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdvideodigitalfilter_inline">SSDLegacyColor</a></div></div><div class="inline-doc" id="djicamera_djicamerassdvideodigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SSDLegacyColor</h6></div>

~~~java
 enum SSDLegacyColor 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_legacy_color_key">CameraKey.SSD_LEGACY_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">The legacy camera color for videos that will be stored in SSD. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideodigitalfilternone">NONE</a></code>. It is only supported Inspire 2 with firmware package versions lower than 01.0.0240.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilternone_inline"></a>NONE</td><td><font color="#666">The camera color is set to none. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterdcinelike_inline"></a>D_CINELIKE</td><td><font color="#666">The camera color is set to DCinelike. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterdlog_inline"></a>D_LOG</td><td><font color="#666">The camera color is set to DLog. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterdcolor1_inline"></a>D_COLOR_1</td><td><font color="#666">The camera color is set to DColor1. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterdcolor2_inline"></a>D_Color_2</td><td><font color="#666">The camera color is set to DColor2. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterdcolor3_inline"></a>D_COLOR_3</td><td><font color="#666">The camera color is set to DColor3. It is only supported by X5S on Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdvideodigitalfilterunknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera color is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerassdcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdcolor_inline">SSDColor</a></div></div><div class="inline-doc" id="djicamera_djicamerassdcolor_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SSDColor</h6></div>

~~~java
 enum SSDColor 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_color_key">CameraKey.SSD_COLOR</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_color_range_key">CameraKey.SSD_COLOR_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera colors for videos that will be stored in SSD. It is only supported Inspire 2 with the firmware package version 01.0.0240 or later.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_standard_inline"></a>STANDARD</td><td><font color="#666">Standard. It is available when the camera is in ISO mode and the SSD license is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_dlog_inline"></a>DLOG</td><td><font color="#666">D-Log. It is available when the camera is in EI mode and the SSD license is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_rec709_inline"></a>REC709</td><td><font color="#666">Rec.709. It is available when the camera is in EI mode and the SSD license is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_cinelike_inline"></a>CINE_LIKE</td><td><font color="#666">Cine-like. It is available when the camera is in ISO mode and the SSD license is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_rawcolor_inline"></a>RAW_COLOR</td><td><font color="#666">Raw color. This is the only for <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicensecinemadng">LicenseKeyTypeCinemaDNG</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcolor_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraexposuresensitivitymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposuresensitivitymode_inline">ExposureSensitivityMode</a></div></div><div class="inline-doc" id="djicamera_djicameraexposuresensitivitymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ExposureSensitivityMode</h6></div>

~~~java
 enum ExposureSensitivityMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_sensitivity_mode_key">CameraKey.EXPOSURE_SENSITIVITY_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The exposure sensitivity modes.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuresensitivitymode_iso_inline"></a>ISO</td><td><font color="#666">ISO mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuresensitivitymode_ei_inline"></a>EI</td><td><font color="#666">EI (exposure index) mode. In this mode, the camera mimics the way a film camera works to help cinematographers capture as much information as possible while balancing the dynamic range and noise with different log curves. This mode only takes effect when the camera mode is in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposuresensitivitymode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraantiflicker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraantiflicker_inline">AntiFlickerFrequency</a></div></div><div class="inline-doc" id="djicamera_djicameraantiflicker_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AntiFlickerFrequency</h6></div>

~~~java
 enum AntiFlickerFrequency 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_anti_flicker_frequency_key">CameraKey.ANTI_FLICKER_FREQUENCY</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_anti_flicker_range_key">CameraKey.ANTI_FLICKER_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera anti-flickers. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker_50hz">MANUAL_50HZ</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraantiflicker_auto_inline"></a>AUTO</td><td><font color="#666">The camera's anti-flicker is automatically set. It is not supported by Z30 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraantiflicker_60hz_inline"></a>MANUAL_60HZ</td><td><font color="#666">The camera's anti-flicker is 60 Hz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraantiflicker_50hz_inline"></a>MANUAL_50HZ</td><td><font color="#666">The camera's anti-flicker is 50 Hz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraantiflicker_disabled_inline"></a>DISABLED</td><td><font color="#666">The anti-flicker is disabled. Only supported by Mavic Air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraantiflicker_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera's anti-flicker is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraexposurestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposurestate_inline">ExposureState</a></div></div><div class="inline-doc" id="djicamera_djicameraexposurestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ExposureState</h6></div>

~~~java
 enum ExposureState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Camera exposure state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurestate_normal_inline"></a>NORMAL</td><td><font color="#666">The camera exposure state is normal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurestate_underexposed_inline"></a>UNDEREXPOSED</td><td><font color="#666">The camera exposure state is underexposed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurestate_overexposed_inline"></a>OVEREXPOSED</td><td><font color="#666">The camera exposure state is overexposed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraexposurestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera exposure state is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerassdoperationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdoperationstate_inline">SSDOperationState</a></div></div><div class="inline-doc" id="djicamera_djicamerassdoperationstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SSDOperationState</h6></div>

~~~java
@EXClassNullAway
 enum SSDOperationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_operation_state_key">CameraKey.SSD_OPERATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Solid State Drive (SSD) State.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_notfound_inline"></a>NOT_FOUND</td><td><font color="#666">SSD is not found.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_idle_inline"></a>IDLE</td><td><font color="#666">SSD is idle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_saving_inline"></a>SAVING</td><td><font color="#666">SSD is Saving.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_formatting_inline"></a>FORMATTING</td><td><font color="#666">SSD is formatting.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">SSD is initializing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_error_inline"></a>ERROR</td><td><font color="#666">SSD validation error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_full_inline"></a>FULL</td><td><font color="#666">SSD is full.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_poorconnection_inline"></a>POOR_CONNECTION</td><td><font color="#666">Communication to SSD is not stable. User can re-plugin SSD. It is supported by X5S.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_switchinglicense_inline"></a>SWITCHING_LICENSE</td><td><font color="#666">SSD is switching the license key. It is supported by X5S.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_formattingrequired_inline"></a>FORMATTING_REQUIRED</td><td><font color="#666">Formatting is required. It is supported by X5S.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_notinitialized_inline"></a>NOT_INITIALIZED</td><td><font color="#666">Not initialized yet. It is supported by X7.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_invalidfilesystem_inline"></a>INVALID_FILE_SYSTEM</td><td><font color="#666">The file system is not supported. It is supported by X7.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdoperationstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">SSD state is unknown. This happens in the first 2 seconds after turning the camera power on as during this time the camera cannot check the state of the SSD.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerassdcapacity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdcapacity_inline">SSDCapacity</a></div></div><div class="inline-doc" id="djicamera_djicamerassdcapacity_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SSDCapacity</h6></div>

~~~java
@EXClassNullAway
 enum SSDCapacity 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_total_space_key">CameraKey.SSD_TOTAL_SPACE</a></td></tr></table></html>



##### Description:



<font color="#666">Solid State Drive (SSD) Capacity.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcapacity_256g_inline"></a>CAPACITY_256_GB</td><td><font color="#666">SSD capacity is 256G.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcapacity_512g_inline"></a>CAPACITY_512_GB</td><td><font color="#666">SSD capacity is 512G.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcapacity_1t_inline"></a>CAPACITY_1_TB</td><td><font color="#666">SSD capacity is 1T.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerassdcapacity_unknown_inline"></a>UNKNOWN</td><td><font color="#666">SSD capacity is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerafileindexmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerafileindexmode_inline">FileIndexMode</a></div></div><div class="inline-doc" id="djicamera_djicamerafileindexmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FileIndexMode</h6></div>

~~~java
 enum FileIndexMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_file_index_mode_key">CameraKey.FILE_INDEX_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">File index modes.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerafileindexmode_reset_inline"></a>RESET</td><td><font color="#666">Camera will reset the newest file's index to be one larger than the largest number of photos taken on the SD card.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerafileindexmode_sequence_inline"></a>SEQUENCE</td><td><font color="#666">Camera will set the newest file's index to the larger of either the maximum number of photos taken on the SD card or the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerafileindexmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerandfiltermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerandfiltermode_inline">NDFilterMode</a></div></div><div class="inline-doc" id="djicamera_djicamerandfiltermode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>NDFilterMode</h6></div>

~~~java
 enum NDFilterMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ndfilter_mode_key">CameraKey.NDFILTER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Modes of ND filter.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerandfiltermode_auto_inline"></a>AUTO</td><td><font color="#666">Auto. ND filter will be enabled or disabled automatically by the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerandfiltermode_on_inline"></a>ON</td><td><font color="#666">The ND filter is on.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerandfiltermode_off_inline"></a>OFF</td><td><font color="#666">The ND filter is off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerandfiltermode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameracustomsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameracustomsettings_inline">CustomSettingsProfile</a></div></div><div class="inline-doc" id="djicamera_djicameracustomsettings_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CustomSettingsProfile</h6></div>

~~~java
 enum CustomSettingsProfile 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_save_settings_to_profile_key">CameraKey.SAVE_SETTINGS_TO_PROFILE</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_load_settings_from_profile_key">CameraKey.LOAD_SETTINGS_FROM_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera user settings. A user can save or load camera settings to or from the specified user.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_default_inline"></a>DEFAULT</td><td><font color="#666">Default user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_profile1_inline"></a>PROFILE_1</td><td><font color="#666">Settings for user 1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_profile2_inline"></a>PROFILE_2</td><td><font color="#666">Settings for user 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_profile3_inline"></a>PROFILE_3</td><td><font color="#666">Settings for user 3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_profile4_inline"></a>PROFILE_4</td><td><font color="#666">Settings for user 4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameracustomsettings_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The user is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameradigitalfilter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradigitalfilter_inline">CameraColor</a></div></div><div class="inline-doc" id="djicamera_djicameradigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CameraColor</h6></div>

~~~java
 enum CameraColor 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_camera_color_key">CameraKey.CAMERA_COLOR</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_camera_color_range_key">CameraKey.CAMERA_COLOR_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Camera color. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_none">NONE</a></code>. Z30 camera only supports <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_none">NONE</a></code>, <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_blackandwhite">BLACK_AND_WHITE</a></code> and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_inverse">INVERSE</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_none_inline"></a>NONE</td><td><font color="#666">The camera color is set to none or no filter.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_art_inline"></a>ART</td><td><font color="#666">The camera color is set to art.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_blackandwhite_inline"></a>BLACK_AND_WHITE</td><td><font color="#666">The camera color is set to black and white.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_bright_inline"></a>BRIGHT</td><td><font color="#666">The camera color is set to bright.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_dcinelike_inline"></a>D_CINELIKE</td><td><font color="#666">The camera color is set to D-Cinelike (called movie before).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_portrait_inline"></a>PORTRAIT</td><td><font color="#666">The camera color is set to portrait. Only supported by Osmo with X3 camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_m31_inline"></a>M_31</td><td><font color="#666">The camera color is set to M31.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_kdx_inline"></a>K_DX</td><td><font color="#666">The camera color is set to kDX.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_prismo_inline"></a>PRISMO</td><td><font color="#666">The camera color is set to prismo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_jugo_inline"></a>JUGO</td><td><font color="#666">The camera color is set to jugo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_dlog_inline"></a>D_LOG</td><td><font color="#666">The camera color is set to D-Log (called neutral before). For Mavic 2 Pro, setting to this color can enable 10-bit DLog-M color profile.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_truecolor_inline"></a>TRUE_COLOR</td><td><font color="#666">The camera color is set to true color. It is only supported by Phantom 4 with firmware v1.2.503 or above.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_inverse_inline"></a>INVERSE</td><td><font color="#666">The camera color is set to inverse.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_reminiscence_inline"></a>REMINISCENCE</td><td><font color="#666">The camera color is set to reminiscence.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_solarize_inline"></a>SOLARIZE</td><td><font color="#666">The camera color is set to solarize.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_posterize_inline"></a>POSTERIZE</td><td><font color="#666">The camera color is set to posterize.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_whiteboard_inline"></a>WHITEBOARD</td><td><font color="#666">The camera color is set to whiteboard.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_blackboard_inline"></a>BLACKBOARD</td><td><font color="#666">The camera color is set to blackboard.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_aqua_inline"></a>AQUA</td><td><font color="#666">The camera color is set to aqua.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_delta_inline"></a>DELTA</td><td><font color="#666">The camera color is set to delta.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_dk79_inline"></a>DK79</td><td><font color="#666">The camera color is set to dk79.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_vision4_inline"></a>VISION_4</td><td><font color="#666">The camera color is set to vision4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_vision6_inline"></a>VISION_6</td><td><font color="#666">The camera color is set to vision6.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_truecolorext_inline"></a>TRUE_COLOR_EXT</td><td><font color="#666">The camera color is set to true color extend.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filma_inline"></a>FILM_A</td><td><font color="#666">The camera color is set to Film A.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmb_inline"></a>FILM_B</td><td><font color="#666">The camera color is set to Film B.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmc_inline"></a>FILM_C</td><td><font color="#666">The camera color is set to Film C.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmd_inline"></a>FILM_D</td><td><font color="#666">The camera color is set to Film D.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filme_inline"></a>FILM_E</td><td><font color="#666">The camera color is set to Film E.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmf_inline"></a>FILM_F</td><td><font color="#666">The camera color is set to Film F.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmg_inline"></a>FILM_G</td><td><font color="#666">The camera color is set to Film G.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmh_inline"></a>FILM_H</td><td><font color="#666">The camera color is set to Film H.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_filmi_inline"></a>FILM_I</td><td><font color="#666">The camera color is set to Film I.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_hlg_inline"></a>HLG</td><td><font color="#666">The camera color is set to HLG (Hybrid Log-Gamma).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameradigitalfilter_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera color is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraeicolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraeicolor_inline">EIColor</a></div></div><div class="inline-doc" id="djicamera_djicameraeicolor_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>EIColor</h6></div>

~~~java
 enum EIColor 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ei_color_key">CameraKey.EI_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">Camera colors for EI mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraeicolor_dlog_inline"></a>D_LOG</td><td><font color="#666">The EI color is set to D-Log.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraeicolor_rec709_inline"></a>REC_709</td><td><font color="#666">The EI color is set to Rec.709.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraeicolor_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraorientation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraorientation_inline">Orientation</a></div></div><div class="inline-doc" id="djicamera_djicameraorientation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Orientation</h6></div>

~~~java
 enum Orientation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_orientation_key">CameraKey.ORIENTATION</a>, <a href="/Components/KeyManager/DJICameraKey.html#camerakey_orientation_range_key">CameraKey.ORIENTATION_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Physical orientation of the camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraorientation_landscape_inline"></a>LANDSCAPE</td><td><font color="#666">By default, the camera is in landscape orientation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraorientation_portrait_inline"></a>PORTRAIT</td><td><font color="#666">The camera is in the portrait orientation, which is rotated 90 degrees in the clockwise direction from the default landscape orientation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraorientation_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerapicturestylepresettype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerapicturestylepresettype_inline">PictureStylePresetType</a></div></div><div class="inline-doc" id="djicamera_djicamerapicturestylepresettype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PictureStylePresetType</h6></div>

~~~java
 enum PictureStylePresetType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_picture_style_preset_key">CameraKey.PICTURE_STYLE_PRESET</a></td></tr></table></html>



##### Description:



<font color="#666">Camera preset type, a combine of Saturation, Contrast, Sharpness.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapicturestylepresettype_standard_inline"></a>STANDARD</td><td><font color="#666">Saturation 0, Contrast 0, Sharpness 0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapicturestylepresettype_landscape_inline"></a>LANDSCAPE</td><td><font color="#666">Saturation 0, Contrast 1, Sharpness 1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapicturestylepresettype_soft_inline"></a>SOFT</td><td><font color="#666">Saturation 0, Contrast 0, Sharpness -1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapicturestylepresettype_custom_inline"></a>CUSTOM</td><td><font color="#666">Custom preset type</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerapicturestylepresettype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown preset type</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameratemperatureunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameratemperatureunit_inline">TemperatureUnit</a></div></div><div class="inline-doc" id="djicamera_djicameratemperatureunit_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>TemperatureUnit</h6></div>

~~~java
 enum TemperatureUnit 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_temperature_unit_key">CameraKey.TEMPERATURE_UNIT</a></td></tr></table></html>



##### Description:



<font color="#666">The temperature units.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratemperatureunit_fahrenheit_inline"></a>FAHRENHEIT</td><td><font color="#666">Use degree Fahrenheit as the unit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratemperatureunit_celsius_inline"></a>CELSIUS</td><td><font color="#666">Use degree Celsius as the unit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameratemperatureunit_unknown_inline"></a>OTHER</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerapicturestylepreset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraPictureStylePreset.html">PictureStylePreset</a></div></div><div class="api-row" id="djicamera_djicamerastoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerastoragelocation_inline">StorageLocation</a></div></div><div class="inline-doc" id="djicamera_djicamerastoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>StorageLocation</h6></div>

~~~java
 enum StorageLocation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_camera_storage_location_key">CameraKey.CAMERA_STORAGE_LOCATION</a></td></tr></table></html>



##### Description:



<font color="#666">Different storage locations supported by the camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerastoragelocation_sdcard_inline"></a>SDCARD</td><td><font color="#666">SD card.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerastoragelocation_internalstorage_inline"></a>INTERNAL_STORAGE</td><td><font color="#666">The internal storage embedded in the aircraft. When it is available, the camera can shoot photos or record videos without SD card. It is only supported by Mavic Air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerastoragelocation_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalroi"><div class="api-col left">Thermal</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalroi_inline">ThermalROI</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalroi_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalROI</h6></div>

~~~java
 enum ThermalROI 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_roi_key">CameraKey.THERMAL_ROI</a></td></tr></table></html>



##### Description:



<font color="#666">Region of interest. Use this feature to manage color range distribution across the screen to maximize contrast for regions of highest interest.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalroi_full_inline"></a>FULL</td><td><font color="#666">Causes the color spectrum to be evenly distributed across the entire image depending the default settings.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalroi_skyexluded33_inline"></a>SKY_EXCLUDED_33</td><td><font color="#666">Ignores areas of the sky 33% so that most of the spectrum can be allocated to remaining areas, providing higher contrast and utility for analysis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalroi_skyexcluded50_inline"></a>SKY_EXCLUDED_50</td><td><font color="#666">Ignores areas of the sky 50% so that most of the spectrum can be allocated to remaining areas, providing higher contrast and utility for analysis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalroi_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The ROI type is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalpalette"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalpalette_inline">ThermalPalette</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalpalette_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalPalette</h6></div>

~~~java
 enum ThermalPalette 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_palette_key">CameraKey.THERMAL_PALETTE</a></td></tr></table></html>



##### Description:



<font color="#666">The different colors are used to show various temperatures in the thermal imagery image. The colors are not actually related to wavelengths of light, but rather the grayscale intensity.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_whitehot_inline"></a>WHITE_HOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is WhiteHot. With Isotherm enabled, the Palette type is WhiteHotIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_blackhot_inline"></a>BLACK_HOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is BlackHot. With Isotherm enabled, the Palette type is BlackHotIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_redhot_inline"></a>RED_HOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is RedHot. With Isotherm enabled, the Palette type is RedHotIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_greenhot_inline"></a>GREEN_HOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is GreenHot. With Isotherm enabled, the Palette type is GreenHotIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_fusion_inline"></a>FUSION</td><td><font color="#666">Without Isotherm enabled, the Palette type is Fusion. With Isotherm enabled, the Palette type is FusionIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_rainbow_inline"></a>RAINBOW</td><td><font color="#666">Without Isotherm enabled, the Palette type is Rainbow. With Isotherm enabled, the Palette type is RainbowIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_ironbow1_inline"></a>IRONBOW_1</td><td><font color="#666">Without Isotherm enabled, the Palette type is Ironbow1. With Isotherm enabled, the Palette type is IronbowWHIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_ironbow2_inline"></a>IRONBOW_2</td><td><font color="#666">Without Isotherm enabled, the Palette type is Ironbow2. With Isotherm enabled, the Palette type is IronbowBHIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_icefire_inline"></a>ICE_FIRE</td><td><font color="#666">Without Isotherm enabled, the Palette type is IceFire. With Isotherm enabled, the Palette type is IceFireIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_sepia_inline"></a>SEPIA</td><td><font color="#666">Without Isotherm enabled, the Palette type is Sepia. With Isotherm enabled, the Palette type is SepiaIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_glowbow_inline"></a>GLOWBOW</td><td><font color="#666">Without Isotherm enabled, the Palette type is Glowbow. With Isotherm enabled, the Palette type is GlowbowIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_color1_inline"></a>COLOR_1</td><td><font color="#666">Without Isotherm enabled, the Palette type is Color1. With Isotherm enabled, the Palette type is MidRangeWHIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_color2_inline"></a>COLOR_2</td><td><font color="#666">Without Isotherm enabled, the Palette type is Color2. With Isotherm enabled, the Palette type is MidRangeBHIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_rain_inline"></a>RAIN</td><td><font color="#666">Without Isotherm enabled, the Palette type is Rain. With Isotherm enabled, the Palette type is RainbowHCIso.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_hotspot_inline"></a>HOT_SPOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is HotSpot. With Isotherm enabled, the Palette type is HotSpotIso.  Only supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_rainbow2_inline"></a>RAINBOW2</td><td><font color="#666">Without Isotherm enabled, the Palette type is Rainbow2. With Isotherm enabled, the Palette type is Rainbow2Iso.  Only supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_gray_inline"></a>GRAY</td><td><font color="#666">Without Isotherm enabled, the Palette type is Gray. With Isotherm enabled, the Palette type is GrayIso.  Only supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_hotmetal_inline"></a>HOT_METAL</td><td><font color="#666">Without Isotherm enabled, the Palette type is HotMetal. With Isotherm enabled, the Palette type is HotMetalIso. Only supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_coldspot_inline"></a>COLD_SPOT</td><td><font color="#666">Without Isotherm enabled, the Palette type is ColdSpot. With Isotherm enabled, the Palette type is ColdSpotIso. Only supported by Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalpalette_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The palette type is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalscene"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalscene_inline">ThermalScene</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalscene_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalScene</h6></div>

~~~java
 enum ThermalScene 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_scene_key">CameraKey.THERMAL_SCENE</a></td></tr></table></html>



##### Description:



<font color="#666">Uses the Scene option to instantly enhance your image.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_linear_inline"></a>LINEAR</td><td><font color="#666">Linearly transforms the 14-bit sensor pixel data to 8-bit JPEG/MP4 pixel data.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_default_inline"></a>DEFAULT</td><td><font color="#666">Automatically adjusts DDE, ACE, SSO, brightness and contrast.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_seasky_inline"></a>SEA_SKY</td><td><font color="#666">Automatically adjusts DDE, ACE, SSO, brightness and contrast with presets optimized for scenes composed of the sea and the sky scenes.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_outdoor_inline"></a>OUTDOOR</td><td><font color="#666">Automatically adjusts DDE, ACE, SSO, brightness and contrast with presets optimized for outdoor scenes.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_indoor_inline"></a>INDOOR</td><td><font color="#666">Automatically adjusts DDE, ACE, SSO, brightness and contrast with presets optimized for indoor scenes.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_manual_inline"></a>MANUAL</td><td><font color="#666">Allows manual setting of DDE, ACE, SSO, brightness and contrast.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_user1_inline"></a>PROFILE_1</td><td><font color="#666">First saved settings of DDE, ACE, SSO, brightness and contrast.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_user2_inline"></a>PROFILE_2</td><td><font color="#666">Second saved settings of DDE, ACE, SSO, brightness and contrast.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_user3_inline"></a>PROFILE_3</td><td><font color="#666">Third saved settings of DDE, ACE, SSO, brightness and contrast.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_inspection_inline"></a>INSPECTION</td><td><font color="#666">Automatically adjusts DDE, ACE, SSO, brightness and contrast with presets optimized for inspection scenes.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalscene_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The Scene type is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalisothermunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalisothermunit_inline">ThermalIsothermUnit</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalisothermunit_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalIsothermUnit</h6></div>

~~~java
 enum ThermalIsothermUnit 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_unit_key">CameraKey.THERMAL_ISOTHERM_UNIT</a></td></tr></table></html>



##### Description:



<font color="#666">The unit for Isotherm. For Zenmuse H20T, please access the value through class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalisothermunit_percentage_inline"></a>PERCENTAGE</td><td><font color="#666">The unit type is percentage. The allowed range is [0, 100].</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalisothermunit_celsius_inline"></a>CELSIUS</td><td><font color="#666">The unit type is degrees Celsius. The allowed range is [-40, 1000].</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalisothermunit_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The unit type is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalgainmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalgainmode_inline">ThermalGainMode</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalgainmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalGainMode</h6></div>

~~~java
 enum ThermalGainMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_gain_mode_key">CameraKey.THERMAL_GAIN_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The gain mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalgainmode_auto_inline"></a>AUTO</td><td><font color="#666">The camera will automatically select the optimal gain mode according to the temperature range of the image.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalgainmode_low_inline"></a>LOW</td><td><font color="#666">The camera covers a wider temperature range but is less sensitive to temperature differences.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalgainmode_high_inline"></a>HIGH</td><td><font color="#666">The camera covers a smaller temperature range but is more sensitive to temperature differences.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalgainmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The gain mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalresolution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalresolution_inline">ThermalResolution</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalresolution_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalResolution</h6></div>

~~~java
 enum ThermalResolution 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_profile_key">CameraKey.THERMAL_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">The resolution of thermal imaging camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalresolution_336x256_inline"></a>RESOLUTION_336x256</td><td><font color="#666">The thermal imaging camera resolution is 336x256.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalresolution_640x512_inline"></a>RESOLUTION_640x512</td><td><font color="#666">The thermal imaging camera resolution is 640x512.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalresolution_384x288_inline"></a>RESOLUTION_384x288</td><td><font color="#666">The thermal imaging camera resolution is 384x288.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalresolution_1024x768_inline"></a>RESOLUTION_1024x768</td><td><font color="#666">The thermal imaging camera resolution is 1024x768.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalresolution_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The thermal imaging camera resolution is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalframerateupperbound"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalframerateupperbound_inline">ThermalFrameRateUpperBound</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalframerateupperbound_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalFrameRateUpperBound</h6></div>

~~~java
 enum ThermalFrameRateUpperBound 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The frame rate upper bound supported by the thermal camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalframerateupperbound_8p3hz_inline"></a>UPPER_BOUND_8_DOT_3_HZ</td><td><font color="#666">The thermal imaging camera frame rate upper bound is 8.3Hz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalframerateupperbound_30hz_inline"></a>UPPER_BOUND_30_HZ</td><td><font color="#666">The thermal imaging camera frame rate upper bound is 30Hz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalframerateupperbound_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The thermal imaging camera frame rate upper bound is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermallensmodel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermallensmodel_inline">ThermalLensFocalLength</a></div></div><div class="inline-doc" id="djicamera_djicamerathermallensmodel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalLensFocalLength</h6></div>

~~~java
 enum ThermalLensFocalLength 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_profile_key">CameraKey.THERMAL_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">The focal length of the thermal imaging camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_6p8mm_inline"></a>LENGTH_6_DOT_8_MM</td><td><font color="#666">The thermal imaging camera's lens focal length is 6.8 mm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_7p5mm_inline"></a>LENGTH_7_DOT_5_MM</td><td><font color="#666">The thermal imaging camera lens focal length is 7.5mm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_9mm_inline"></a>LENGTH_9_MM</td><td><font color="#666">The thermal imaging camera's lens focal length is 9 mm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_13mm_inline"></a>LENGTH_13_MM</td><td><font color="#666">The thermal imaging camera's lens focal length is 13 mm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_19mm_inline"></a>LENGTH_19_MM</td><td><font color="#666">The thermal imaging camera's lens focal length is 19 mm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermallensmodel_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The thermal imaging camera's lens focal length is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalversion_inline">ThermalVersion</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalversion_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalVersion</h6></div>

~~~java
@EXClassNullAway
 enum ThermalVersion 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">There is a standard version and version with Advanced Radiometry capabilities of the Zenmuse XT thermal camera. This enum defines the versions.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalversion_xtstandard_inline"></a>XT_STANDARD</td><td><font color="#666">The thermal camera is Zenmuse XT Standard version.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalversion_xtadvancedradiometry_inline"></a>XT_ADVANCED_RADIOMETRY_ENABLED</td><td><font color="#666">The thermal camera is Zenmuse XT Advanced Radiometry version.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalcustomexternalscenesettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalcustomexternalscenesettings_inline">ThermalCustomExternalSceneSettingsProfile</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalcustomexternalscenesettings_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalCustomExternalSceneSettingsProfile</h6></div>

~~~java
 enum ThermalCustomExternalSceneSettingsProfile 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_custom_external_scene_settings_profile_key">CameraKey.THERMAL_CUSTOM_EXTERNAL_SCENE_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">User defined parameters.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalcustomexternalscenesettings_profile1_inline"></a>PROFILE_1</td><td><font color="#666">Custom thermal external scene settings for user 1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalcustomexternalscenesettings_profile2_inline"></a>PROFILE_2</td><td><font color="#666">Custom thermal external scene settings for user 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalcustomexternalscenesettings_profile3_inline"></a>PROFILE_3</td><td><font color="#666">Custom thermal external scene settings for user 3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalcustomexternalscenesettings_profileunknown_inline"></a>UNKNOWN</td><td><font color="#666">The user is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalffcmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalffcmode_inline">ThermalFFCMode</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalffcmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalFFCMode</h6></div>

~~~java
 enum ThermalFFCMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_ffc_mode_key">CameraKey.THERMAL_FFC_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Flat-field correction mods.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalffcmode_auto_inline"></a>AUTO</td><td><font color="#666">Automatic flat-field correction mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalffcmode_manual_inline"></a>MANUAL</td><td><font color="#666">Manual flat-field correction mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalffcmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown flat-field correction mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalprofile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraThermalProfile.html">ThermalProfile</a></div></div><div class="api-row" id="djicamera_djicamerathermaldigitalzoomscale"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermaldigitalzoomscale_inline">ThermalDigitalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_djicamerathermaldigitalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalDigitalZoomFactor</h6></div>

~~~java
 enum ThermalDigitalZoomFactor 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_digital_zoom_factor_key">CameraKey.THERMAL_DIGITAL_ZOOM_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Thermal camera digital zoom scale. The default value is x1.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermaldigitalzoomscale_x1_inline"></a>X_1</td><td><font color="#666">Digital zoom factor x1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermaldigitalzoomscale_x2_inline"></a>X_2</td><td><font color="#666">Digital Zoom factor is x2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermaldigitalzoomscale_x4_inline"></a>X_4</td><td><font color="#666">Digital Zoom factor is x4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermaldigitalzoomscale_x8_inline"></a>X_8</td><td><font color="#666">Digital Zoom factor is x8. Not support by Mavic 2 Enterprise Dual Light Camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermaldigitalzoomscale_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Digital Zoom factor is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalmeasurementmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalmeasurementmode_inline">ThermalMeasurementMode</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalmeasurementmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ThermalMeasurementMode</h6></div>

~~~java
@EXClassNullAway
 enum ThermalMeasurementMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_measurement_mode_key">CameraKey.THERMAL_MEASUREMENT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Thermal camera temperature measurement mode. The default value is  Disabled.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalmeasurementmode_disabled_inline"></a>DISABLED</td><td><font color="#666">Disable temperature measuring.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalmeasurementmode_spotmetering_inline"></a>SPOT_METERING</td><td><font color="#666">Enable temperature measurement and set mode to spot metering. Use <code>DJICamera_didUpdateTemperatureData</code> to receive the updated temperature data. In this mode, the advanced radiometry version XT camera can change the metering point using <code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalspotmeteringtargetpoint">setThermalSpotMeteringTargetPoint</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalmeasurementmode_areametering_inline"></a>AREA_METERING</td><td><font color="#666">Enable temperature measurement and set mode to area metering. Use <code><a href="/Components/Camera/DJICamera_ThermalCameraAreaTemperatureAggregationsUpdatedCallbackInterface.html#djicamera_didupdateareatemperatureaggregations">onUpdate</a></code> to receive the updated temperature data. Only supported by the advanced radiometry version XT camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerathermalmeasurementmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Thermal camera's temperature measurement mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerathermalareatemperatureaggregations"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html">ThermalAreaTemperatureAggregations</a></div></div><div class="api-row" id="djicamera_djicamerathermalexternalscenesettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html">ThermalExternalSceneSettings</a></div></div>
