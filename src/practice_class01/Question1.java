package practice_class01;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Write a program and calculate grade of three exams with the given values
		 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 EXAMPLE: INPUT : Math=70
		 * Science=60 Chemistry=89 A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
		 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your math grade...");
		
		int mathGrade = scanner.nextInt();
		
		System.out.println(mathGrade >= 90 && mathGrade <=100 ? "MathGrade = A" : mathGrade>=80  && mathGrade<=89 ? "MathGrade= B" :
				mathGrade>=70 && mathGrade<=89 ? "MathGrade = C " : mathGrade >=60 && mathGrade <= 69 ? "MathGrade = D" : mathGrade>=0 && mathGrade<=59 ? " MathGrade= F " : "Wrong Grade");
		
		System.out.println("What is your science grade...");
		int scienceGrade = scanner.nextInt();

		System.out.println(scienceGrade >= 90 && scienceGrade <=100 ? "MathGrade = A" : scienceGrade>=80 && scienceGrade<=89 ? "MathGrade= B" :
				scienceGrade>=70 && scienceGrade<=89 ? "MathGrade = C " : scienceGrade >=60 && scienceGrade <= 69 ? "MathGrade = D" :
					scienceGrade>=0 && scienceGrade<=59 ? " MathGrade= F " : "Wrong Grade");
		System.out.println("Whjat is your chemistry grade...");
		int chemistryGrade = scanner.nextInt();
				
				System.out.println(chemistryGrade >= 90 && chemistryGrade <=100 ? "MathGrade = A" : chemistryGrade>=80 && chemistryGrade<=89 ? "MathGrade= B" :
						chemistryGrade>=70 && chemistryGrade<=89 ? "MathGrade = C " : chemistryGrade >=60 && chemistryGrade <= 69 ? "MathGrade = D" :
							chemistryGrade>=0 && chemistryGrade<=59 ? " MathGrade= F " : "Wrong Grade");	

	scanner.close();
	}

}
