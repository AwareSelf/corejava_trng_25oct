package mainapp;

public class UseEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1,"Ram",40000);
		System.out.println(e);
		e.computeAnnSal();
		
		Manager m = new Manager(2,"Shyam",85000,"Sales",15000);
		System.out.println(m);
		m.delegate();
		
		
		//runtime polymorphism
		Employee ex = new Manager(3,"Rahul",95000,"Hr",25000);
		ex.computeAnnSal();
		
		if(ex instanceof Manager)
		 ((Manager)ex).delegate();
		
		//runtime polymorphism
		meth(new Employee(12,"Geet",60000));
		meth(new Manager(13,"Radha",95000,"Hr",25000));
		
        meth(m);
        meth(e);
	}
	
	public static void meth(Employee e)
	{
		
		e.computeAnnSal();
		
		//use instaceof to check dynamic type of object
		if(e instanceof Manager)
		{
			//casted type and actual type should be same or is-a relationship
			//else it throws classcastexception so use instanceof to check the 
			//actual rutime type of an object before casting
			((Manager)e).delegate(); 
		}
	}

}






