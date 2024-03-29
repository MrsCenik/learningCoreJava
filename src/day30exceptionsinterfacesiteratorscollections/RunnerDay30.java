package day30exceptionsinterfacesiteratorscollections;

public class RunnerDay30 {

	public static void main(String[] args) {
	
		HondaCivic hc1 = new HondaCivic();
		
		hc1.accelerate();
		hc1.climate();
		hc1.gasUsage();
		
		// There is a difference in usage, static methods in a class and static methods in an interfaces?
		// To call a static method from an interface, use "interface" name.
		Music.volume();	
	
//		System.out.println(hc1.name);
//		System.out.println(hc1.system);
		
		//If your parent interfaces have variables with same name and 
		//you use object to call them, Java confuses and gives CTE. 
		//System.out.println(hc1.price);
		
		//In interfaces to call variables using interfaces name are the best option
		System.out.println(Engine.price);
		
		
		//Having abstract methods with the same name in parent interfaces is not problem
		//But if the methods whose names are same have different return types gives CTE
		//If you use different return types , make the method names different.
		
		//hc1.eat(); ************************************
	
	
	
	
	
	}
}
