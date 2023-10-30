package abstractex;

public class UseAbstractEx {

	public static void main(String[] args) {
	
		Shape s;
	//	s = new Shape(); //Shape is abstract you cant instantiate it
		s = new Square(7);
		s.computeArea();
		s.computePerimeter();
		
      // meth(new Shape());
	 meth(new Square(5));
	 meth(s);
	 
	 
	}
	
	
	public static void meth(Shape s)
	{
		s.computeArea();
		s.computePerimeter();
		
		
	}

}
