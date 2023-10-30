package abstractex;

public class Square extends Shape {
	
	public Square(double side)
	{
		super(side,"Square");
	}

	@Override
	public double computeArea() {
	  
		return this.getSide1() * this.getSide1();
		
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return this.getSide1() * 4;
	}

	@Override
	public String toString() {
		return "Square [side =" + getSide1() + "]";
	}
	
	

}
