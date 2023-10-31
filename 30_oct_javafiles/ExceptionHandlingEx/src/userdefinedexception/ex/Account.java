package userdefinedexception.ex;

public class Account {
	
	private int acctId;
	private double bal;
	private String acctHolderName;
	
	public Account(int acctId, double bal, String acctHolderName) {
		super();
		this.acctId = acctId;
		this.bal = bal;
		this.acctHolderName = acctHolderName;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		
		if(this.bal > 0)
		  this.bal = bal;
		else
			System.out.println("Balance cant be negative or zero");
	}

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}
	
	public double deposit(double amt)
	{
		this.bal = this.bal + amt;
		return this.bal;
	}
	
	public double withdraw(double amt) throws InsufficientBalance
	{
		if(amt <= this.bal)
		{
			  this.bal = this.bal - amt;
		}
		else
		{
			System.out.println("amt to be withdrawn:"+amt+", insufficient balance:"+this.bal);
		    throw new InsufficientBalance(this,amt,"withdraw unsuccessful");
		}
		
		return this.bal;
	}

	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", bal=" + bal + ", acctHolderName=" + acctHolderName + "]";
	}
	
	
	

}
