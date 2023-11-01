package string_stringbuffer_stringbuilder_wrapperclasses;

public class StringEx1 {
	
	
	public static void main(java.lang.String[] args) {
	
		String s1 = "abc";  //String literal
		
		String s2 = "abc";  //String literal
		
		//String literal with same value == String literal same value = true
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //true - it checks value (doesnt check the memory)
		
		String s3 = new String("abc");  //String object
		
		// String object same value == String literal with same value  = false
		System.out.println(s1==s3); 
		System.out.println(s1.equals(s3)); //true - it checks value (doesnt check the memory)
		
		
		//StringBuffer is mutable in Java
		StringBuffer sb1 = new StringBuffer("abc");
		sb1.append(" def");
		System.out.println(sb1);
		
		//when are you going to use StringBuffer/StringBuilder
		String name = "Nmarata Marathe";
		name = name.toLowerCase().substring(5).concat("ddd"); //40 -50 modification - 40, 50 string objects literal
		System.out.println(name);
	
	    //whenever you want to do lot of string modifications - wrap string inside stringbuffer
		//do the modifications and finally convert it back to string.
		//avoid creting to many strings behind the scene and efficient usage of memory
		StringBuffer sb = new StringBuffer(name);
		//10-20 modification string buffer -> it will make to changes to same stringbuffer object
		//you can avoid creation of multiple string object literals
		name = sb.append(12.2).append(" haa haa haa").substring(5).toLowerCase().toString();
		System.out.println(name);
		
	    //StringBuilder - added 1.5 all methods exactly same as StringBuffer
		//usage of StringBuilder is same as StringBuffer
		//also use StringBuilder when u have to do lots of modifications to String
		StringBuilder sbld = new StringBuilder(name);
		//10-20 modification string buffer -> it will make to changes to same stringbuffer object
		//you can avoid creation of multiple string object literals
		name = sbld.append(12.2).append(" haa haa haa").substring(5).toLowerCase().toString();
		System.out.println(name);
		
     
		//diff StringBuffer and StringBuilder
		//String Builder is non-thread-safe version of String-Buffer
		//its better to use StringBuilder when u are not sharing Sting instance, dont need
		//thread-safety --> as its is slighlty faster than StringBuilder.
		
	}

}
