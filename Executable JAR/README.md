# Package Name Replace Script

## What Is This?

The **DJI\_Script\_ReplacePackageName.jar** is an executable JAR file which contains script to help replace the old package names or class names (SDK Version 3.2.1) to the new ones (SDK Version 3.3) in your Android Studio Project.

## How to Use It?

**1.** Download the **DJI\_Script\_ReplacePackageName.jar** file and put it in any places (Like the root folder of your project).

**2.** Make sure you have installed the JDK (The minimum JDK version is 1.6) successfully and configured the environment variables in your PC/Mac.

**3.** Use `cd` command to change directory to the location of the JAR file, execute the JAR file using the following commands in your **Terminal**:

~~~
Java -jar DJI_Script_ReplacePackageName.jar YourFilePath 
~~~

- Replace the "YourFilePath" with the path of your project.

- If your source code has Chinese characters, please use the following commands and replace the "YourEncodingFormat" with the correct Encoding Format (Like UTF-8, GBK):

  ~~~
  Java -jar -Dfile.encoding=YourEncodingFormat DJI_Script_ReplacePackageName.jar YourFilePath 
  ~~~

**4.** Then the script will help to traverse all the files of your project and replace the old package names and class names.

**5.** Once the script finish running, please rebuild your project in Android Studio to check if there are any compiling issues.

> Note: The script cannot solve all the compiling errors, you may still need to import the missing package names or modify the input parameters manually.
> 
> 