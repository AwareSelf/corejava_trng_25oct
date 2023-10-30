package abstractex;

public class Rectangle extends Shape {
	
	public Rectangle(double side1,double side2,String shapeType)
	{
		super(side1,side2,shapeType);
	}

	@Override
	public double computeArea() {
	  
		return this.getSide1() * this.getSide2();
		
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.getSide1()+this.getSide2());
	}

	@Override
	public String toString() {
		return "Rectangle [side1 =" + getSide1() + ", side2 =" + getSide2() + "]";
	}

		

}
