package interfaceex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseInterface {

	public static void main(String[] args) {
		
		//intf ref = instance class implementing intf
		Bounceable b = new Ball("red"); //is-a relationship
		b.setBounceFactor(5);
		b.bounce();
		 
		Tyre t; //you can create a reference of abstract class but not an instance
		// b = new Tyre();  //it is abstract and abstract class cant be instantiated
		b = new MRFTyre();
		b.setBounceFactor(5);
		b.bounce();
		

		meth(new MRFTyre(),4);
		meth(new Ball("blue"),10);
		
		//java.util.List --> java.util.ArrayList  --> datastractures in util package
		//interface ref (List) = new Implementation class - ArrayList (using runtime polymorphism)
		List<Bounceable> lst = new ArrayList<Bounceable>();
		lst.add(new MRFTyre());
		lst.add(new Ball("red"));
		
		meth1(lst,5);
		

	}
	
	
	public static void meth(Bounceable b,int bf)
	{
		b.setBounceFactor(bf);
		b.bounce();
		if(b instanceof MRFTyre)
		{
		 ((MRFTyre) b).getTyreDetails(); //classcastexception
		}
	}
	
	public static void meth1(List<Bounceable> lst,int bf)
	{
		Iterator<Bounceable> itr = lst.iterator();
		while(itr.hasNext())
		{
			Bounceable x = itr.next(); //runtime polymorphism
			x.setBounceFactor(bf);
			x.bounce();
			if(x instanceof MRFTyre)
			{
			  ((MRFTyre) x).getTyreDetails();
			}
		}
		
	}

}
