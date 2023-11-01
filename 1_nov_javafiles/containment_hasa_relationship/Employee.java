package containment_hasa_relationship;
import java.util.*;


public class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	private int totExp;
  
  //	private int deptNo;
	
	//Employee has-a Dept
	//containment / composition
	//one-on-one has-a relationship
    private Dept dept;
    
    //one-to-many - has-a relationship
    private List<Training> trainings;
	
    
    private static int ct;
    
    
    
    static {
    
    //	ct = 50;
    	ct=0;
    	
    }
    
    
	
	public Employee()
	{
		System.out.println("0 arg emp constructor called");
		this.ct++;
		
	}
	
	public Employee(int empId,String empName,double empSal,int totExp)
	{
		System.out.println("argwala emp constructor called");
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.totExp = totExp;
		this.ct++;
		
	}
	
	public Employee(Employee e)
	{
		System.out.println("emp copy constructor called");
		this.empId = e.empId;
		this.empName = e.empName;
		this.empSal = e.empSal;
		this.totExp = e.totExp;
		this.ct++;
	}
	
	
	
	public Employee(int empId, String empName, double empSal, int totExp, Dept dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.totExp = totExp;
		this.dept = dept;
	}
	
	

	public Employee(int empId, String empName, double empSal, int totExp, Dept dept, List<Training> trainings) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.totExp = totExp;
		this.dept = dept;
		this.trainings = trainings;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	

	public int getTotExp() {
		return totExp;
	}

	public void setTotExp(int totExp) {
		this.totExp = totExp;
	}
	
	
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	
	public List<Training> getTrainings() {
		return trainings;
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}

	public static void methh()
	{
		ct =8;
	  //it will not allow to access nonstatic-instance variable from static block/static method
		//as instance might not be created while this static method is being accessed.
	}

	public static int getCt() {
		return ct;
	}

	//function overloading - func name,arg list diff, return type may or maynot be same
	public double computeAnnSal()
	{
		
		System.out.println("computeAnnSal of Employee called");
		return this.empSal * 12;
		
		
	}
	
	public double computeAnnSal(double bonus)
	{
		return this.empSal *12 + bonus;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", totExp=" + totExp
				+ ", dept=" + dept + ", trainings=" + trainings + "]";
	}

	
	
	
	
}