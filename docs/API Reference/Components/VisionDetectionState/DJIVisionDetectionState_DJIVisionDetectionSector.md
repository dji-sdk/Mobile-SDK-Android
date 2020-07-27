<div class="article"><h1 ><font color="#AAA">class </font>ObstacleDetectionSector</h1></div>

~~~java
@EXClassNullAway
 class ObstacleDetectionSector 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_detection_sectors_key">FlightControllerKey.DETECTION_SECTORS</a></td></tr></table></html>



##### Description:



<font color="#666">The vision system can see in front of the aircraft with a 60 degree horizontal field of view (FOV) and 55 degree  vertical FOV. The horizontal FOV is split into four equal sectors, and this class gives the distance and warning  level for one sector.



##### Class Members:

<div class="api-row" id="djivisiondetectionstate_djivisiondetectionsector_warninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisiondetectionsector_warninglevel_inline">getWarningLevel</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisiondetectionsector_warninglevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningLevel</h6></div>

~~~java
 ObstacleDetectionSectorWarning getWarningLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The warning level based on distance.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning">ObstacleDetectionSectorWarning</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning">ObstacleDetectionSectorWarning</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisiondetectionsector_obstacledistanceinmeters"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisiondetectionsector_obstacledistanceinmeters_inline">getObstacleDistanceInMeters</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisiondetectionsector_obstacledistanceinmeters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getObstacleDistanceInMeters</h6></div>

~~~java
 float getObstacleDistanceInMeters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The detected obstacle distance to the aircraft in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djivisiondetectionstate_visionsectorwarning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_visionsectorwarning_inline">ObstacleDetectionSectorWarning</a></div></div><div class="inline-doc" id="djivisiondetectionstate_visionsectorwarning_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ObstacleDetectionSectorWarning</h6></div>

~~~java
@EXClassNullAway
 enum ObstacleDetectionSectorWarning 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Distance warning returned by each sector of the front vision system. Warning Level 6 is the most serious level. For different aircraft, the same warning level will refer to different distances. Spark only supports the follow warning levels: <ul>
    <li><code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning_invalid">INVALID</a></code></li>
    <li><code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning_level1">LEVEL_1</a></code></li>
    <li><code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning_level2">LEVEL_2</a></code></li>
    <li><code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning_level3">LEVEL_3</a></code></li>
    <li><code><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_visionsectorwarning_unknown">UNKNOWN</a></code></li>
</ul>



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_invalid_inline"></a>INVALID</td><td><font color="#666">The warning level is invalid. The sector cannot determine depth of the scene in front of it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level1_inline"></a>LEVEL_1</td><td><font color="#666">Warning level 1. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by  the sector and the aircraft is over 10 meters. <br> - Spark: the distance between the obstacle  detected by the sector and the aircraft is over 4 meters. <br> - Others: the distance between  the obstacle detected by the sector and the aircraft is over 20 meters.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level2_inline"></a>LEVEL_2</td><td><font color="#666">Warning level 2. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by the  sector and the aircraft is between 8 - 10 meters. <br> - Spark: the distance between the obstacle  detected by the sector and the aircraft is between 2 - 4 meters. <br> - Others: the distance between  the obstacle detected by the sector and the aircraft is between 15 - 20 meters.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level3_inline"></a>LEVEL_3</td><td><font color="#666">Warning level 3. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by the sector  and the aircraft is between 6 - 8 meters. <br> - Spark: the distance between the obstacle detected by the  sector and the aircraft is less than 2 meters. <br> - Others: the distance between the obstacle detected  by the sector and the aircraft is between 10 - 15 meters.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level4_inline"></a>LEVEL_4</td><td><font color="#666">Warning level 4. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by the sector and the  aircraft is between 4 - 6 meters. <br> - Others: the distance between the obstacle detected by the sector and the  aircraft is between 6 - 10 meters. Spark does not support this warning level.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level5_inline"></a>LEVEL_5</td><td><font color="#666">Warning level 5. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by the sector and the  aircraft is between 2 - 4 meters. <br> - Others: the distance between the obstacle detected by the sector and the  aircraft is between 3 - 6 meters. Spark does not support this warning level.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_level6_inline"></a>LEVEL_6</td><td><font color="#666">Warning level 6. <br> - Phantom 4 and Mavic Pro: the distance between the obstacle detected by the sector and the  aircraft is less than 2 meters. <br> - Others: the distance between the obstacle detected by the sector and the  aircraft is less than 3 meters. Spark does not support this warning level.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsectorwarning_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The distance warning is unknown. This warning is returned when an exception occurs.</td></tr></table></html>

##### Class Members:

</div>


