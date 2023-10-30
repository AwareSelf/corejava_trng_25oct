package interfaceex;

public class UseInterface {

	public static void main(String[] args) {
		
		//intf ref = instance class implementing intf
		Bounceable b = new Ball("red"); //is-a relationship
		b.setBounceFactor(5);
		b.bounce();
		
		// b = new Tyre();
		// b.bounce();

	}

}
