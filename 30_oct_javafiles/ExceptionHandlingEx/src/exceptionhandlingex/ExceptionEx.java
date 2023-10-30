package exceptionhandlingex;

public class ExceptionEx {
	
	//all RuntimeException and its subclasses come under category
	//of unchecked exceptions

	public static void main(String[] args) {
		
		String s = null;
		System.out.println("program starts..");
		
		if(s!=null)	
		{
	       	System.out.println(s.toLowerCase());
		}
		else
		{
			System.out.println("String s coule not be null");
		}
		System.out.println("continues with remaining program");
		

	}

}
