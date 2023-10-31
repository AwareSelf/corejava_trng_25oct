package exceptionhandlingex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceException {
	
	//all RuntimeException and its subclasses come under category
	//of unchecked exceptions

	public static void main(String[] args) {
		
		//all non-runtime exceptions (extending from exception but not extending from RuntimeException)
		//come under category of checked exceptions
		//compiler will mandate you to write a exception handling code to deal with that kind
		//of exception (checked catgory exception)
	    System.out.println("program starts..");
		meth();
		
		System.out.println("continues with remaining program in main");
	
	}
	
	public static boolean meth()
	{
		  
		  int ct =0;
		  File f = new File("C://java_vw_25oct//corejava_trng//ExceptionHandlingEx//src//exceptionhandlingex//ExceptionEx.java");
		
		  File f1 = new File("C://java_vw_25oct//corejava_trng//ExceptionHandlingEx//src//exceptionhandlingex//ExceptionEx11.java");
		  try( FileReader fr = new FileReader(f);
			 FileWriter fw = new FileWriter(f1) )
		{
		
		 //FileReader is class meant to read from source - file in a character mode
		  int ch;
		  while((ch = fr.read())!=-1) //-1 denotes EOF
		  {
		    System.out.print((char)ch);
		    ct++;
		    	
		    if(ct==20)
		    	return true;
		  }
		 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("exception msg:"+e.getMessage());
		//	e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("some another ioexception: like file read..etc.");
		}
		
		System.out.println("remaining code from meth continues...");
		return false;
	}

}
