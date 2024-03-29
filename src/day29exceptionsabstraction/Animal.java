package day29exceptionsabstraction;

public abstract class Animal {
	/*
	  1) Abstract method can be stored in "Abstract Classes"
	  2) To create an abstract method, a) Do not put method body
	 								   b) Put "abstract" keyword between access modifier and return type
	  3) For abstract method "public", protected" ,and "default" access modifiers can be used
	  	but "private" cannot because we create "abstract methods" to access from child classes. 
	  4) Abstract classes can have concrete methods as well, but "concrete classes" can have just concrete methods.
	  5) Abstract methods must be overridden by child classes, otherwise you will get CTE
	  	Note: Because of that, if we think something is must for every child class, 
	  	we make the abstract then child classes have to override them.
	  6) Just concrete child classes must to override "abstract methods", it is not must to override abstract for abstract child classes. 
	  7) If an abstract method is overridden by class X, child class of the class X may not override the method.
	  8) You cannot create object from abstract classes
	  9) Abstract classes are classes because of that they have constructors, but constructors are not used
	 	  to create objects, they can be used to initialize variables
	 */
	
	abstract void eat();
	
	public void drink() {
		System.out.println("They drink");
	}
}
