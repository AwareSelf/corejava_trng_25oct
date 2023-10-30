package inheritance.ex;

public class UseInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Manager m = new Manager(1,"Ram",50000,"Sales",50000,5);
		System.out.println(m); //m.toString()
		double annsal = m.computeAnnSal();
		System.out.println(annsal);
		
		Emp e = new Manager(2,"Shyam",15000,"HR",50000,4);
		System.out.println(e); //m.toString()
		annsal = e.computeAnnSal();
		System.out.println(annsal);
		
		meth( new Manager(3,"Aditi",25000,"Accounts",50000,4));
		meth( new Emp(4,"Mita",5000));
		meth(new WageEmp(5,"Sita",5000,100,1000));

	}
	
	//correct use of runtime polymorphism
	public static void meth(Emp e)
	{
		System.out.println(e); //m.toString()
		double annsal = e.computeAnnSal();
		System.out.println(annsal);
		
		if(e instanceof Manager)
		{ 
			((Manager)e).delegate(); 
		}
		
		
	}

}
