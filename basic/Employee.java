package basic;

/*
java.lang 
  Object
     - toString
     - equals
*/

public class Employee {
	
	
	//numeric - byte- 8bit,short-16bit,int-32bit,long-64bit
	 private int empId;
	 private  double empSal;
	 private String empName;
	 
	 
	 public Employee()
	 {
		 
		 System.out.println("Emp 0 arg constructor called...");
		 this.empId = 5;
		 this.empName = "Namrata";
		 this.empSal=5000;
	 }
	 
	 public Employee(int id,String name,double sal)
	 {
		empId = id;
		empName = name;
		empSal = sal;
	 }
	 
	 
	 
	 public double getEmpSal() {
		return this.empSal;
	}



	public void setEmpSal(double empSal) {
		if(empSal > 0)
		{
	    	this.empSal = empSal;
		}
		else
		{
			System.out.println("Sal should be greater than 0");
		}
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpId() {
		return empId;
	}



	public void showDetails()
	 {
		 System.out.println("emp: empId"+empId+",empSal:"+empSal+",empName:"+empName);
	 }
	
	public double computeAnnSal()
	{
		return this.empSal * 12;
	}
	 
	//override
	
	
	 public boolean equals(Object o) 
	 {
		 return this.empId == ((Employee)o).empId; //meaningfully equlas if empid same
	 }
	 
	
	

}
