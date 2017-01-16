# Java samples and code

To get this sample to run, you must [install OpenCV](http://opencv.org/downloads.html) on your local machine. You will also need [Apache Ant](http://ant.apache.org) to build the sample JAR file.  

Your environment should define the following environment variables:

* JAVA_HOME = the directory containing your JDK
* ANT_HOME = the directory in which Apache Ant is installed
* OPENCV_HOME = the directory in which all of OpenCV is installed
* OPENCV_LIB = the directory containing all native libraries
* OPENCV_JAR = the path to the file containing the java interface to OpenCV (typically named something like "opencv-300.jar" )

Execute the code by changing to the directory for GRIP-code-generation/java and then executing "ant run".

This code runs with OpenCV 3.0.0.  I have had less success with 3.1.0.

## Installing on Windows

Download and decompress the precompiled [OpenCV for Windows](http://opencv.org/downloads.html).  The OPENCV_JAR file will be under build/java.  For most computers, the OPENCV_LIB directory will be at build/java/x86.


