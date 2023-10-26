package mainapp;
public class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	
	public Employee()
	{
		System.out.println("0 arg emp constructor called");
		
	}
	
	public Employee(int empId,String empName,double empSal)
	{
		System.out.println("argwala emp constructor called");
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
	}
	
	public Employee(Employee e)
	{
		System.out.println("emp copy constructor called");
		this.empId = e.empId;
		this.empName = e.empName;
		this.empSal = e.empSal;
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

	public double computeAnnSal()
	{
		return this.empSal * 12;
	}
	
	public double computeAnnSal(double bonus)
	{
		return this.empSal *12 + bonus;
	}
	
	public String toString()
	{
		return "empId:"+this.empId+",empName:"+this.empName+",empSal:"+this.empSal;
	}
}