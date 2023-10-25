package basic;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi All!");
		func("namrata");
		
	
		
		//create object - allocate memmory for properties,initialise properties
		Employee e = new Employee();
		
	//	e.empSal =-1;
		e.setEmpSal(-1);
		e.showDetails();
		System.out.println(e.getEmpSal());
		
		e.setEmpSal(10000);
		System.out.println(e.getEmpSal());
	
		int id = e.getEmpId();
		System.out.println("emp id:"+id);
		System.out.println("emp id:"+e.getEmpId());
		
		double annsal = e.computeAnnSal();
		System.out.println("annual salary of emp with id "+id+" is "+annsal);
		
		
		
		// e = new Employee(2,"Geeta",5000);
		// e.showDetails();
		 
		 
		
	//	 Employee e1 = e;
		 e = new Employee(2,"Geeta",5000);
		 e.showDetails();
		 System.out.println(e.computeAnnSal());
		 
		 Employee e2 = new Employee(3,"Radha",15000);
		 e2.showDetails();
		 System.out.println(e2.computeAnnSal());
		
		Employee e3 = new Employee(3,"Radha",15000);
		System.out.println(e2==e3);
		System.out.println(e2.equals(e3));
		

	}
	
	
	static void func(String greet)
	{
		System.out.println("Hi "+greet);
		
	}

}


