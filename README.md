# DJI Mobile SDK V4 for Android Latest Alpha Version 4.18-a1

##  Alpha Version Announcement

1. To improve the problem-solving efficiency of developers' feedback, we will fix the serious problems first. And we will release the alpha version immediately after the regression test.
2. For letting developers experience and test the MSDK functions that have been developed but not officially released, we will also release the alpha version immediately after the product acceptance test and functional test. 
3. The alpha version is not strictly tested before the release. There might exist some unstable problems. Please judge and choose whether to use this version according to the release note. If you have other problems, please contact us immediately.
4. All changes in the alpha version will be merged into the official version and will be strictly tested before the release.
5. It is not suggested that developers directly merge the MSDK alpha version and released it as an official version.

## Release Date
2024.09.26

# Released Function List

- Adapted to Android 14.

# Bug Fixes
- On Matrice 300 RTK, If you exit MSDK during a waypoint mission, start the waypoint mission will fail after restarting MSDK: **Fixed**
- On Matrice 300 RTK, PSDK payload cannot obtain video data of custom channels: **Fixed**
- On Matrice 300 RTK, continuous download of panoramic photos using Zenmuse H20 camera will cause crash: **Fixed**
- On Matrice 300 RTK, refreshing the media file list using Zenmuse H20 camera will cause duplicate files: **Fixed**
- Occasional crash of `libffmpeg.so`: **Fixed**
- Occasional crash of `libDJICSDKCommon.so`: **Fixed**
- Occasional crash of `Mapbox`: **Fixed**

> **Notes:**
> **Please change "com.secneo.sdk.Helper.install(this)" in MSDK application initialization to "com.cySdkyc.clx.Helper.install(this)", otherwise MSDK will not run.**

## Integration

Declare dependency via Maven:

~~~xml
<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk-alpha</artifactId>
    <version>4.18-a1</version>
</dependency>

<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk-provided-alpha</artifactId>
    <version>4.18-a1</version>
</dependency>
~~~

or Gradle:

~~~groovy
compile 'com.dji:dji-sdk-alpha:4.18-a1'
provided 'com.dji:dji-sdk-provided-alpha:4.18-a1'
~~~

For further detail on how to integrate the DJI Android SDK into your Android Studio project, please check the [Integrate SDK into Application](http://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-integrate.html#import-maven-dependency) tutorial.
