# DJI Mobile SDK for Android

## What Is This?

The DJI Mobile SDK enables you to automate your DJI Product. You can control flight, and many subsystems of the product including the camera and gimbal. Using the Mobile SDK, create a customized mobile app to unlock the full potential of your DJI aerial platform.

## Integration

Declare dependency via Maven:

~~~xml
<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk</artifactId>
    <version>4.7.1</version>
</dependency>

<dependency>
    <groupId>com.dji</groupId>
    <artifactId>dji-sdk-provided</artifactId>
    <version>4.7.1</version>
</dependency>
~~~

or Gradle:

~~~groovy
compile 'com.dji:dji-sdk:4.7.1'
provided 'com.dji:dji-sdk-provided:4.7.1'
~~~

For further detail on how to integrate the DJI Android SDK into your Android Studio project, please check the [Integrate SDK into Application](http://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-integrate.html#import-maven-dependency) tutorial.

## Running the SDK Sample Code

Developers can [run the sample application](https://developer.dji.com/mobile-sdk/documentation/quick-start/index.html#android-sample-app) to immediately run code and see how the DJI Mobile SDK can be used.

One of DJI's aircraft or handheld cameras will be required to run the sample application.

## Development Workflow 

From registering as a developer, to deploying an application, the following will take you through the full Mobile SDK Application development process:

- [Prerequisites](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-prerequisits.html)
- [Register as DJI Developer & Download SDK](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-register.html)
- [Integrate SDK into Application](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-integrate.html)
- [Run Application](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-run.html)
- [Testing, Profiling & Debugging](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-testing.html)
- [Deploy](https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-deploy.html)

## Sample Projects & Tutorials

Several Android tutorials are provided as examples on how to use different features of the Mobile SDK and debug tools includes:

- [Application Activation and Aircraft Binding](http://developer.dji.com/mobile-sdk/documentation/android-tutorials/ActivationAndBinding.html)
- [Getting Started with UX SDK](http://developer.dji.com/mobile-sdk/documentation/android-tutorials/UXSDKDemo.html)
- [Camera Application](https://developer.dji.com/mobile-sdk/documentation/android-tutorials/FPVDemo.html)
- [MapView and Waypoint Application (GaodeMap)](https://developer.dji.com/mobile-sdk/documentation/android-tutorials/GSDemo-Gaode-Map.html)
- [MapView and Waypoint Application (GoogleMap)](https://developer.dji.com/mobile-sdk/documentation/android-tutorials/GSDemo-Google-Map.html)
- [TapFly and ActiveTrack Application](https://developer.dji.com/mobile-sdk/documentation/android-tutorials/P4MissionsDemo.html)
- [Simulator Application](http://developer.dji.com/mobile-sdk/documentation/android-tutorials/SimulatorDemo.html)
- [GEO System Application](http://developer.dji.com/mobile-sdk/documentation/android-tutorials/GEODemo.html)

## Learn More about DJI Products and the Mobile SDK

Please visit [DJI Mobile SDK Documentation](https://developer.dji.com/mobile-sdk/documentation/introduction/index.html) for more details.

## DJI Mobile UX SDK

DJI Mobile UX SDK is a suite of product agnostic UI objects that fast tracks the development of iOS applications using the DJI Mobile SDK. For more details, please check [here](https://github.com/dji-sdk/Mobile-UXSDK-Android).

## ProGuard

If you're planning on optimizing your app with [ProGuard](https://developer.android.com/studio/build/shrink-code.html), you can add the following rules to your app's `proguard.cfg` file:

- For **AAR** file, please use the following rule:

~~~
"-libraryjars ./PATH_TO_THIS_FILE/dji_android_sdk.aar"
~~~

- For **API Library** folder, please use the rules in [proguard-project.txt](./proguard-project.txt) file. 

> **Note**: There are two types of DJI Android SDK: **AAR** and **API Library folder**, you can download them from DJI Developer Website: <http://developer.dji.com/mobile-sdk/downloads/>.

## SDK Keys

SDK Keys can be used as an alternative interface to access the product.

A detailed introduction for SDK Keys is [here](./docs/README-KeyedInterface.md).

## Missions Refactor

Missions are an important part of the SDK as they allow developers to automate DJI's products using a simple, high level interface. In 4.0, missions are being refactored to be more robust and easier to manage.

A detailed introduction for missions is [here](./docs/README-Mission.md).

## Android Bridge App

Please check this [link](https://github.com/dji-sdk/Android-Bridge-App) to download the apk of the Android Bridge App apk file.

## SDK API Reference

[**Android SDK API Documentation**](http://developer.dji.com/api-reference/android-api/index.html)

## FFmpeg License

The DJI Android SDK is dynamically linked with unmodified libraries of <a href=http://ffmpeg.org>FFmpeg</a> licensed under the <a href=http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html>LGPLv2.1</a>. The source code of these FFmpeg libraries, the compilation instructions, and the LGPL v2.1 license are provided in [Github](https://github.com/dji-sdk/FFmpeg).

## Support

You can get support from DJI with the following methods:

- Post questions in [**Stackoverflow**](http://stackoverflow.com) using [**dji-sdk**](http://stackoverflow.com/questions/tagged/dji-sdk) tag
- dev@dji.com


## Join Us

DJI is looking for all kinds of Software Engineers to continue building the Future of Possible. Available positions in Shenzhen, China and around the world. If you are interested, please send your resume to <software-sz@dji.com>. For more details, and list of all our global offices, please check <https://we.dji.com/jobs_en.html>.

DJI 招软件工程师啦，based在深圳，如果你想和我们一起把DJI产品做得更好，请发送简历到 <software-sz@dji.com>.  详情请浏览 <https://we.dji.com/zh-CN/recruitment>.
