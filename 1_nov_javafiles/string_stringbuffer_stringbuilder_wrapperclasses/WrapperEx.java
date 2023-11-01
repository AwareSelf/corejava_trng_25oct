package string_stringbuffer_stringbuilder_wrapperclasses;

import java.util.*;

public class WrapperEx {

	public static void main(String[] args) {
		
		int no = 6;
		
		// Integer = int
		Integer n = no; //auto-boxing in java   // Integer n = new Integer(no);
		
		Integer no1 = new Integer(200);
		
		no = no1;  // int = Integer //auto-unboxing //  int no =  no1.intValue()
		
		
		//conversions 
		int x = 10;
	    //numeric conversions
		//int -> double
		Integer xx = x;
        double d = xx.doubleValue();
        float f = xx.floatValue();
        short s = xx.shortValue();
        
        //int --> String
        String s1 = xx.toString();
        //String s1 --> int
        int nx = new Integer(s1).intValue(); // new Integer(String) is deprecated in java 9
        int nn = Integer.parseInt(s1);
        String s2 = xx.toString(s, 2);
        
        //int --> String
        Integer np =nn;
        s1 = np.toString();
        
        //int -->String //directly int  to String using static valueOf method
        s1 = Integer.valueOf(nn).toString(); //toHexString, toBinaryString
        
        double price = 50.5;
        //int pricee = (int)price;
        Double p = price;
        int pricee = p.intValue();
        
        int pricee2 = new Double(d).intValue(); //new WrapperType(primitve) -- deprecated
       
        //valueOf static method - primitive --> wrapper
        int pricee1 = Double.valueOf(d).intValue();
        
        
        double d1 = 12.3; //by default if it isnumeric literal with decimal point in it -> double literal
        float f1 = 12.3f; //12.3 floating point literal
        
         int j = 12;
         long l = 12l;
        // j = 12l; //long literal  //cannot assign long-literal/long-value to int variable
         j = Long.valueOf(12l).intValue();
         Long ll = l;
         j = ll.intValue();
         
         
         //conversion methods
         
         //String --> primtive - static parseXXX()
         //primitive --> String - step 1: box primitive to Wrapper type, step 2: wrappertype.toString()
        
         // Integer.valueOf(20).intValue()
         //primitive --> String - WrapperClass.valueOf(primitive).xxxValue() 
         
         // numeric int --> other numeric types
         // assign it to wrapper type.xxxValue()
         // int --> double 
         // Integer = int (boxing),  Integer.doubleValue()
         // Integer.valueOf(primtive int).doubleValue()
         
         //all collection classes only store Object Types
        // List<int> lst  = new ArrayList<int>();  --error
          List<Integer> lst = new ArrayList<Integer>();
          lst.add(10);  //primitive --> autoboxed --> wrapper type
          int val = 100;
          lst.add(val);
          
          int val1 = lst.get(0); // get(index) -Integer object --> auto-unboxed --> primitive type
	}

}
