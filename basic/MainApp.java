package basic;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no =5;
		
		int no1 = 10;
		
		boolean r = no==no1;
		
		
		System.out.println(r);
		
		Employee e1 = new Employee(1,"Radha",5000);
		
		Employee e2 = new Employee(1,"Radha",5000);
		
		Employee e3 = new Employee(2,"Namrata",15000);
		
		System.out.println("e1 & e2 are same:"+(e1==e2)); //false
		System.out.println("e1 & e2 are same:"+e1.equals(e2)); //false ==> == operator //true
		
		
		
		
		e1 = e2;
		
		System.out.println(e1==e2); //false
		
		
		//meaningfully equal - e1 and e2 - app point of view they are equal

	}

}
