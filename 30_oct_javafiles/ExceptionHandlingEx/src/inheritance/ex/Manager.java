package inheritance.ex;

import java.util.Objects;

public class Manager extends Emp {
	
	private String mgrType;
	private double variablePay;
	private int teamSize;
	
	
	public Manager(int empId, String empName, double empSal, String mgrType, double variablePay, int teamSize) {
		super(empId, empName, empSal);
		System.out.println("inside manager constructor..");
		this.mgrType = mgrType;
		this.variablePay = variablePay;
		this.teamSize = teamSize;
	}

	@Override
	public double computeAnnSal()
	{
		System.out.println("computeAnnSal of Manager called..");
		return super.computeAnnSal() + this.variablePay;
	}
	
	public void delegate()
	{
		System.out.println("Manager "+this.getEmpName()+"delegating to team of size "+this.teamSize);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(mgrType);
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
		Manager other = (Manager) obj;
		return  super.equals(obj);
	}

	@Override
	public String toString() {
		return "Manager [mgrType=" + mgrType + ", variablePay=" + variablePay + ", teamSize=" + teamSize
				+ ", " + super.toString() + "]";
	}

   
	
    

}

