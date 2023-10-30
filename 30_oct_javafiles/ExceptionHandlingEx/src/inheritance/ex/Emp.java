package inheritance.ex;

import java.util.Objects;

public class Emp {
	
	private int empId;
	private String empName;
	private double empSal;
	
	
		
	public Emp(int empId, String empName, double empSal) {
		//super(); //empty super() is implicitly added by compiler
		
		System.out.println("inside emp constructor..");
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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


	public int getEmpId() {
		return empId;
	}


	
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId;
	}

	
	public double computeAnnSal()
	{
		System.out.println("computeAnnSal of Emp called..");
		return this.empSal*12;
	}
	
	
	
   
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
		

}
