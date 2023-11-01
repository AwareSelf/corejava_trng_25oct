package string_stringbuffer_stringbuilder_wrapperclasses;

public class StringEx {
	
	
	public static void main(java.lang.String[] args) {
	
		//String are treated a immutable in Java
		
		String s =  "abc";
		
	//	s.concat("def");
		s.toUpperCase(); // "abc" , new modified instance -  "ABC"
		
		System.out.println(s); //abc
		
		
		String s1 =  "abc";       //  "abc"   s1 = "ABC"
		
	//	s1 = s1.concat("def");
		s1 = s1.toUpperCase(); //"ABC" //reassign the ref to point to newly created instance of String
		
		System.out.println(s1);
		
		String name = "Namrata Marathe";
		int l = name.length();
		System.out.println(l); //length = 15 , charAt(0) - charAt(14)
		
		String n = "";
		
		if(n.length()>=1)
		  System.out.println(n.charAt(0));
		
		byte[] arr = name.getBytes();
		
		String nn = " nama ";
		name = name.trim().toUpperCase();
		
		System.out.println(name);
		
		//String -> conversion int,numeric type
		String no = " 10";  //String - int
		String no1 = "20 "; //String - int
		
		int r = Integer.parseInt(no.trim()) +  Integer.parseInt(no1.trim());
		System.out.println(r);
		
		int noo = 100;
		
		String sx = (""+noo);  //int - String
		sx = Integer.toString(noo); //int - String
		
		//int (decimal) - binary string
		noo = 4;
		sx = Integer.toBinaryString(noo);
		System.out.println(sx);
		
		//binary string - int (decimal)
		int noo1 = Integer.parseInt(sx, 2);
		System.out.println(noo1);
		
		

	}

}
