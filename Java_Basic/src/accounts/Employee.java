package accounts;

public class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	private int acctId;
	private String panId;
	
	public Employee()
	{
		System.out.println("0 arg emp constructor called");
		
	}
	
	public Employee(int empId,String empName,double empSal,int acctId,String panId)
	{
		System.out.println("argwala emp constructor called");
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.acctId = acctId;
		this.panId = panId;
		
	}
	
	public Employee(Employee e)
	{
		System.out.println("emp copy constructor called");
		this.empId = e.empId;
		this.empName = e.empName;
		this.empSal = e.empSal;
		this.acctId = e.acctId;
		this.panId = e.panId;
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
	
	

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
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
		return "empId:"+this.empId+",empName:"+this.empName+",empSal:"+this.empSal
				+",acctId:"+this.acctId+",panId"+this.panId;
	}
}