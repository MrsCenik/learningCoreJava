package day21listsforeachloop;
      
import day24multithreadsyncencapsulation.AccessModifier01;

//we created for day24
public class AccessModifierRunner01 extends AccessModifier01{

	public static void main(String[] args)  {
		AccessModifier01 obj2=new AccessModifier01();
		/*
		 1. By using obj1, you cannot access to “profession” because “profession” is 
		 	 using private access modifier and you are in a different class.
		 2. By using obj1, you cannot access to "school" because "school" is using "default" access modifier and 
		 	you cannot access "default" class members from any other "packages"	 
		 3.  By using obj1, you cannot access to "address" because "school" is using "protected" access modifier and 
		 	you cannot access "protected" class members from any other "packages",  if they are not "child class". 
		 4. By using obj1, you can access to "name" because it is public. 
		 */
		System.out.println(obj2.name);
//		System.out.println(obj2.address);
		
	

	}

}
