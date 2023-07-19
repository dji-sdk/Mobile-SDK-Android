# DJI Mobile SDK V4 for Android Latest Alpha Version 4.17-a1

##  Alpha Version Announcement

1. To improve the problem-solving efficiency of developers' feedback, we will fix the serious problems first. And we will release the alpha version immediately after the regression test.
2. For letting developers experience and test the MSDK functions that have been developed but not officially released, we will also release the alpha version immediately after the product acceptance test and functional test. 
3. The alpha version is not strictly tested before the release. There might exist some unstable problems. Please judge and choose whether to use this version according to the release note. If you have other problems, please contact us immediately.
4. All changes in the alpha version will be merged into the official version and will be strictly tested before the release.
5. It is not suggested that developers directly merge the MSDK alpha version and released it as an official version.

## Release Date
2023.7.19

## Released Function List
- **Adapted to Android 13.**
- **Added supported aircraft model:**
  - ***Matrice 350 RTK***
- **Added functions for Matric 300 RTK:**
  - **Supports the DJI RC Plus.**
- **Supports the CMCC RTK function.**
- **Added functions for Zenmuse H20:**
  - **Supports the link zoom function.**
  - **Supports the NightScene AUTO setting function.**
  - **Supports the getLiveviewLocationWithGPS API.**

## Bug Fixes
- **Crash of libDJISDKLOGJNI.so:** Fixed
- **Crash of NotFoundException: String resource ID:** Fixed
- **Crash when creates dji-guid.jpg:** Fixed
- **Memory leaks after the live streaming function is closed:** Fixed
- **The TapZoom function is not available by infrared camera on M2EA:** Fixed
- **The Waypoint action callback can not be received when recovering the wayline flight on Matrice 300 RTK:** Fixed
- **Watermark information setting failes on Zenmuse H20T:** Fixed
- **Error message Camera restars abnormally. appears on Zenmuse P1:** Fixed
- **Pulling photos from camera may occasionally fail on DJI Mini 2:** Fixed

## Integration

Declare dependency via Maven:

~~~xml
<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk-alpha</artifactId>
    <version>4.17-a1</version>
</dependency>

<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk-provided-alpha</artifactId>
    <version>4.17-a1</version>
</dependency>
~~~

or Gradle:

~~~groovy
compile 'com.dji:dji-sdk-alpha:4.17-a1'
provided 'com.dji:dji-sdk-provided-alpha:4.17-a1'
~~~

For further detail on how to integrate the DJI Android SDK into your Android Studio project, please check the [Integrate SDK into Application](http://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-integrate.html#import-maven-dependency) tutorial.
