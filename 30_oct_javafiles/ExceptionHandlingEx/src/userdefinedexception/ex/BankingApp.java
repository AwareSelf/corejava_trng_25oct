package userdefinedexception.ex;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
	
		
		Account ob = new Account(1,5000,"namrata");
		String yesno;
		
		do
		{
			System.out.println("Existing balance for acctid:"+ob.getAcctId()+" is:"+ob.getBal());
	     	Scanner sc = new Scanner(System.in);
	     	System.out.println("Enter amt to be withdrawn:");
	     	double amt = -1;
	     	if(sc.hasNextDouble())
	     	{
	     		amt = sc.nextDouble();
	     		 try {
					ob.withdraw(amt);
				} catch (InsufficientBalance e) {
				
					System.out.println(e);
					break;
				}
	     		
	     	}
	     	
	     	System.out.println("do you wish to withdraw more:(y/n):");
	     	
	         yesno = sc.next();
		  
		   
		}while(yesno.charAt(0)=='y');

	}

}
