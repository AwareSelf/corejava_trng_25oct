package abstractex;


//abstract class -? a class having abstract method in it ( method without body)

//Shape -> Square , Rectangle, Circle - 
public abstract class Shape {
	
	private double side1,side2,side3;
	private double radius;
	private String shapeType;
	
	public Shape(double side1,String shapeType) {
		super();
		this.side1 = side1;
		this.shapeType =  shapeType;
	}

	public Shape(double side1, double side2,String shapeType) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.shapeType =  shapeType;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	public abstract double computeArea();

	
	public abstract double computePerimeter();


	@Override
	public String toString() {
		return "Shape [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", radius=" + radius + "]";
	}

	
	

}
