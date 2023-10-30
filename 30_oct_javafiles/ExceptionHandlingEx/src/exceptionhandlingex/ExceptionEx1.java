package exceptionhandlingex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx1 {
	
	//all RuntimeException and its subclasses come under category
	//of unchecked exceptions

	public static void main(String[] args) {
		
		//all non-runtime exceptions (extending from exception but not extending from RuntimeException)
		//come under category of checked exceptions
		//compiler will mandate you to write a exception handling code to deal with that kind
		//of exception (checked catgory exception)
		 System.out.println("program starts..");
		try
		{
		  FileReader fr = new FileReader("abc.java");
		  int ch = fr.read();
		  System.out.println((char)ch);
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
		
		System.out.println("continues with remaining program");
		

	}

}
