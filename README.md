# JavaavaJreverseShell

Java r3vs43ll is made for Windows environment and it will work with the same version it is created with. Download Java JDK and make sure you pick the appropriate version that matches with the host's version on which you wish to run.
https://www.oracle.com/java/technologies/downloads/

# Remember

Before a .jar is generated, you will need a manifest. Please see https://stackoverflow.com/questions/1238145/how-to-run-a-jar-file .

Add your IP and Port to the source code.

# How to use

Within the directory where your .java file is located run:

Compile the Jave file
javac filename.java

Create the jar executable here
jar cvfm filename.jar manifest.txt filename.class

Run the jar file from command line or just double click from the UI.
java -jar filename.jar
