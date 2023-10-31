package userdefinedexception.ex;

public class InsufficientBalance extends Exception {
	
	Account act;
	double amt;
	
	
	public InsufficientBalance(Account act,double amt,String msg)
	{
		super(msg);
		this.act = act;
		this.amt = amt;
	}
	
	
	public String toString()
	{
		return "For account holder:"+ this.act.getAcctHolderName()+
				 " withdraw of amt: "+this.amt+" is unsucessful for balance :"+this.act.getBal();
	}

}
