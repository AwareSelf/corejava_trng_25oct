package containment_hasa_relationship;
import java.util.*;

public class ContainmentEx {

	public static void main(String[] args) {
		
		//one-to-one relationship
		Dept d = new Dept(10,"Accoutnts",6);
		Dept d1 = new Dept(11,"Projects",100);
		
		Employee e = new Employee(1,"Raja",45000,10,d1);
		String deptname = e.getDept().getDeptName();
		System.out.println("deptname of emp "+e.getEmpName()+" is "+deptname);
		
		
		Employee fresher =  new Employee(2,"Geet",5000,0);
		fresher.setDept(d);
		deptname = fresher.getDept().getDeptName();
		System.out.println("deptname of emp "+fresher.getEmpName()+" is "+deptname);
		
		Employee fresher1 =  new Employee(2,"Geet",5000,0);
		fresher1.setDept(new Dept(12,"logistics",3));
		deptname = fresher1.getDept().getDeptName();
		System.out.println("deptname of emp "+fresher1.getEmpName()+" is "+deptname);
		
		Dept dx = fresher1.getDept();
		System.out.println("Dept details of emp "+fresher1.getEmpName());
		
		
		//one-to-many
		Training t1 = new Training("Java");
		Training t2 = new Training("Angular");
		
		List<Training> lst = new ArrayList<Training>();
		lst.add(t1);
		lst.add(t2);
		
		fresher1.setTrainings(lst);
		
		System.out.println(fresher1);
		
		//after few days emp -> trainings attended
		
		 Training t = fresher1.getTrainings().get(0);
		 System.out.println("1st training attended by fresher "+fresher1.getEmpName()+" is :"+t);
	}

}
