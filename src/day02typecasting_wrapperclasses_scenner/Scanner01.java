package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 1)To get data from user we need to use "Scanner Class" in Java
		 2)To be able to use "Scanner Class"
		 	a)Create an object from "Scanner Class"
		 		Class Name -> ObjectName -> "=" -> "new" -> ClasName();
		 	b)By using the object access to the methods and use them
		 */
		//Create an object from Scanner class like below
		
		Scanner scanner = new Scanner(System.in); 
		
		//Give a message to the user about what to enter
		
		System.out.println("Hey user, enter your age...");
		
		//Get the date user entered and put it into a container
		
		int age = scanner.nextInt();
		
		//Then use the data user entered however you want
		
		System.out.println(age);
		
		scanner.close();
		

	}

}
