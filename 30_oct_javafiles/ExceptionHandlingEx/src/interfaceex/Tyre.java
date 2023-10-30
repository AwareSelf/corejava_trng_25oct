package interfaceex;

//abstract class cant be instantiated but is available for futher inheritance - inheritance chain 
public abstract class Tyre implements Bounceable{

	int bounceFactor;
	
	public Tyre()
	{
		this.bounceFactor = 0;
	}
	
	/*
	@Override
	public void setBounceFactor(int bf) {
		// TODO Auto-generated method stub
		
	}
   */
	@Override
	public void bounce() {
		System.out.println("Tyre is bouncing with bouncefactor = "+this.bounceFactor);
		
	}

}

class MRFTyre extends Tyre
{

	 
	 
	@Override
	public void setBounceFactor(int bf) {
		this.bounceFactor = bf;
		
	}
	
	
	public String getTyreDetails()
	{
		return "Tyre meant for 4 wheeler";
	}
	
	
}
