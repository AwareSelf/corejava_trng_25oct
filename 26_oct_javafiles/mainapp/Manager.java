package mainapp;

public class Manager extends Employee {
	
	private String mgrType;
	private int teamSize;
	private double variablePay;
	
	

	public Manager() {
		super();
		System.out.println("Manager 0 arg constructor called...");
	}



	public Manager(int empId, String empName, double empSal, String mgrType,double variablePay) {
		super(empId, empName, empSal);
		this.mgrType = mgrType;
		this.variablePay = variablePay;
		
		System.out.println("Manager argwala constructor called...");
	}
	
	
	public void delegate()
	{
	  System.out.println("delegating to employee of team size:"+this.teamSize);	
	}
	
	@Override
	public double computeAnnSal()
	{
		System.out.println("overriden computeAnnSal of Manager is called..");
		return super.computeAnnSal() + this.variablePay;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString()+", mgrType:"+this.mgrType+",variable pay:"+this.variablePay;
	}
	
    	

}
