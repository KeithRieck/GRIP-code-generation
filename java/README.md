# Java samples and code

To get this sample to run, you must [install OpenCV](http://opencv.org/downloads.html) on your local machine. You will need [Apache Ant](http://ant.apache.org) to build the sample JAR file.  

Your environment should define the following environment variables:

* JAVA_HOME = the directory containing your JDK
* ANT_HOME = the directory in which Apache Ant is installed
* OPENCV_HOME = the directory in which all of OpenCV is installed
* OPENCV_LIB = the directory containing all native libraries
* OPENCV_JAR = the path to the JAR file containing the java interface to OpenCV (typically named something like "opencv-320.jar" )

Execute the code by changing to the directory for GRIP-code-generation/java and then executing "ant run".

## Installing OpenCV on Windows

Windows has the easiest install, because the OpenCV site has everything precompiled.

Download and unzip [OpenCV for Windows](http://opencv.org/downloads.html).
* OPENCV\_JAR will be at `${OPENCV_HOME}/build/java/opencv-320.jar`
* OPENCV\_LIB will be at `${OPENCV_HOME}/build/java/x86`

## Installing OpenCV on Linux, including Raspberry Pi

For Linux operating systems, you'll need to [build everything](http://docs.opencv.org/2.4/doc/tutorials/introduction/desktop_java/java_dev_intro.html). 

The build process takes a long time, especially on a Raspberry Pi.  Follow the instructions carefully and you'll be OK.  You can start by [cloning the github repository](https://github.com/opencv/opencv) or you can start by downloading the [OpenCV for Linux/Mac](http://opencv.org/downloads.html) ZIP file.
* OPENCV\_JAR will be at `${OPENCV_HOME}/build/bin/opencv-320.jar`
* OPENCV\_LIB will be at `${OPENCV_HOME}/build/lib`

## Installing OpenCV on MacOS

A Macintosh install is similar to building on Linux, except you may need to take extra steps to [get the build tools](https://blogs.wcode.org/2014/10/howto-install-build-and-use-opencv-macosx-10-10/).  You will need the Mac version of [cmake](https://cmake.org/download/) and you'll need to install [Apache Ant](http://stacktips.com/how-to/how-to-install-ant-in-your-mac-os-x).

Just like in Linux, the environment variables defined in your `.bash_profile` should be:
* OPENCV\_JAR will be at `${OPENCV_HOME}/build/bin/opencv-320.jar`
* OPENCV\_LIB will be at `${OPENCV_HOME}/build/lib`

## Using OpenCV in Eclipse

In Eclipse you should define a User Library OpenCV.  Open the Eclipse preferences dialog and go to Java / Build Path / User Libraries.  Create a new User Library named "opencv-3.2.0". To this library, attach 'opencv-320.jar' as an external JAR.  Then, expand that JAR reference and specify the Native Library Location to be your OPENCV\_LIB directory.

To use OpenCV in a Eclipse Java project, open the project's properties dialog and add the new user library to the Java Build Path Libraries.
