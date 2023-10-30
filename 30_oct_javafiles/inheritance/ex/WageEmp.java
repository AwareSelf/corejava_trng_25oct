package inheritance.ex;

import java.util.Objects;

public class WageEmp extends Emp {
	
	private int noOfDays;
	private double amtPerDay;
	
	
	
	
	public WageEmp(int empId, String empName, double empSal, int noOfDays, double amtPerDay) {
		super(empId, empName, empSal);
		this.noOfDays = noOfDays;
		this.amtPerDay = amtPerDay;
	}




	@Override
	public double computeAnnSal()
	{
		System.out.println("computeAnnSal of WageEmp called..");
		return super.computeAnnSal() + (this.amtPerDay *  this.noOfDays);
	}


	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(amtPerDay, noOfDays);
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WageEmp other = (WageEmp) obj;
		return  super.equals(obj);
	}





	@Override
	public String toString() {
		return "WageEmp [noOfDays=" + noOfDays + ", amtPerDay=" + amtPerDay + ", toString()=" + super.toString() + "]";
	}
	
	

}
