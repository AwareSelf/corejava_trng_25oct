package exceptionhandlingex;

/*
 * understand the use of throws clause (handle or declare rule followed by compiler for checked exceptions),
 * using try-finally block before propagating the exception
 * to caller method
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx3 {
	
	//all RuntimeException and its subclasses come under category
	//of unchecked exceptions

	public static void main(String[] args)  {
		
	
		//all non-runtime exceptions (extending from exception but not extending from RuntimeException)
		//come under category of checked exceptions
		//compiler will mandate you to write a exception handling code to deal with that kind
		//of exception (checked catgory exception)
	    System.out.println("program starts..");
		try {
			meth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch block of IOException in main method");
			e.printStackTrace();
		}
		
		System.out.println("continues with remaining program in main");
	
	}
	
	//for checked exception - handle or declare rule
	public static boolean meth() throws IOException
	{
		  FileReader  fr = null;
		  int ct =0;
	 try
	 {
		File f = new File("C://java_vw_25oct//corejava_trng//ExceptionHandlingEx//src//exceptionhandlingex//ExceptionExx.java");
		fr = new FileReader(f); //FileReader is class meant to read from source - file in a character mode
		  int ch;
		  while((ch = fr.read())!=-1) //-1 denotes EOF
		  {
		    System.out.print((char)ch);
		    ct++;
		    	
		    if(ct==20)
		    	return true;
		  }
	 }
	 finally
	 {
		 //finally makes sure that all opened resources are closed
		 //before checked IOException gets propogated to the caller (in this case main method)
		 System.out.println("finally block executed inside meth method");
		 if(fr!=null)
		   fr.close();
	 }	
		System.out.println("remaining code from meth continues...");
		return false;
	}

}
