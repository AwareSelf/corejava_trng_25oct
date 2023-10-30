package interfaceex;

public class Ball implements Bounceable {

	private String ballColor;
	private int bounceFactor;
	
	public Ball(String color)
	{
		this.ballColor = color;
	}
	
	
	public String getBallColor() {
		return ballColor;
	}

	public void setBallColor(String ballColor) {
		this.ballColor = ballColor;
	}

	public int getBounceFactor() {
		return bounceFactor;
	}

	@Override
	public void setBounceFactor(int bf) {
		 this.bounceFactor = bf * 5;	
	}

	@Override
	public void bounce() {
		
		System.out.println(this.ballColor+" color Ball is bouncing with bounce factor:"+this.bounceFactor);
		
	}
	
	

}
