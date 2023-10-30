package abstractex;

import java.util.Scanner;

public class UseAbstractEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Shape s;
	//	s = new Shape(); //Shape is abstract you cant instantiate it
		double side=1,side1=1,side2=1;
		
		System.out.println("Enter side of Square:");
		if(sc.hasNextDouble())
		  side = sc.nextDouble();
		else
			System.out.println("side of square has to be a double value!");
		
		s = new Square(side);
		s.computeArea();
		s.computePerimeter();
		
      // meth(new Shape());
	 meth(new Square(5));
	 meth(s);
	 
	 System.out.println("Enter side1 of Rectangle:");
	 
	 if(sc.hasNextDouble())
	  side1 = sc.nextDouble();
	 else
		System.out.println("side of rectangle has to be a double value!");
	 
	 System.out.println("Enter side2 of Rectangle:");
	 
	 if(sc.hasNextDouble())
	  side2 = sc.nextDouble();
	 else
	  System.out.println("side of rectangle has to be a double value!");
	 
	 meth(new Rectangle(side1,side2,"Rectangle"));
	// meth(new Rectangle(5,10,"Rectangle"));
	 
	 sc.close();
	 
	 
	}
	
	
	public static void meth(Shape s)
	{
		double area = s.computeArea();
		double perimeter = s.computePerimeter();
		
		switch(s.getShapeType())
		{
	
		case "Square":
			System.out.println("Area and Perimeter of Shape - Square are:area="+area+ " and pm= "+perimeter);	
			break;
		
		case "Rectangle":
			System.out.println("Area and Perimeter of Shape - Rectangle are:area="+area+ " and pm= "+perimeter);	
			break;
		
		default:
			System.out.println("Shape didnot match any of the existing Shape Type..");
		
		}
		
	}

}
