package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*Type a program which calculates the area and the perimeter of a square whose side length is entered by user.
		 a==> Area: a*a
		 a==> Perimeter: 4*a
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hey user enter the side length of the square...");
		
		double side = scanner.nextDouble();
		
		
		System.out.println("Area:" + side*side);
		System.out.println("Perimeter:" + 4*side);
		scanner.close();
	}

}
