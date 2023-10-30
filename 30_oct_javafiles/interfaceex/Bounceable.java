package interfaceex;

//outlines all functionality related to particular feature/features based 
//interface tells you what is there in that feature but it doesn't mention
//how it is implemented

//interface is like a contract - what will be there as part of the contract is mentioned
//in the interface

//once a class implements a interface it is signing contract so it has to implement (by overriding)
//all the abstract methods(methods that dont have body)  in that interface

//if it doesnot implement even a single abstract inherited method then its breaching contract
//and in that case you will have to mark the whole class as abstract (incomplete)

//once a class is abstract (incomplete) you cannot create a instance of it although you
//can create a reference of it.

public interface Bounceable {
	
	//all methods in an interface are by default public and abstract
	//abstract methods dont have body/implementation
	void setBounceFactor(int bf); //abstract method
	void bounce();

}
