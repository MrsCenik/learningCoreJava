package lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {
	

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        
        getSumOfAllElements(l);
        System.out.println();
        getSumOfIntFrom7To100A();
        System.out.println(); 
        getSumOfIntFrom7To100B();
        System.out.println();
        getMultiplicationOfIntFrom2To11();
        System.out.println();
        findFactorial(-2);
        System.out.println();
        sumOfEvenInGivenRange(7,4); 
        System.out.println();
        getSumOfDigitsOfInteger(123, 127);//123->6, 124->7, 125-->8, 126->9, 127->10
		
	}
	   //1)Create a method to find the sum of all elements in the list
		  public static void getSumOfAllElements(List<Integer> l) {	
	//In functional programming some methods like reduce() must be the last method, that kind of methods are called "terminal methods"
			Integer sum = l.stream().reduce(0, Math::addExact);		
			System.out.println(sum);		
		}
		
		//2)Create a method to find the sum of integers from 7 to 100
				//1.Way:
		   public static void getSumOfIntFrom7To100A() {
				
				Integer sum = IntStream.range(7, 101).reduce(0,Math::addExact);
				
				System.out.println(sum);//5029
				
			}
		//2.Way:
			public static void getSumOfIntFrom7To100B() {
				
				Integer sum = IntStream.rangeClosed(7, 100).sum();//sum() ==> Returns the sum of elements in this stream
				
				System.out.println(sum);//5029
				
			}
		
		//3)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
			public static void getMultiplicationOfIntFrom2To11() {	
				
				Integer result = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
				
				System.out.println(result);//39916800			
			}
		
		//4)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
			public static void findFactorial(int x) {
				
				if(x<0) {
					
					System.out.println("Do not use negative numbers...");
					
				}else {
					
					Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
					
					System.out.println(result);
				
				}
		
			}
		//5)Create a method to calculate the sum of even integers between given two integers
			public static void sumOfEvenInGivenRange(int s, int e) {
		
			Integer result = IntStream.rangeClosed(s,e).filter(Utils ::checkToBeEven).sum();
			System.out.println(result);
		
		
			}
	    //6)Create a method to calculate the sum of digits of every integers between given two integers
		
			public static void getSumOfDigitsOfInteger(int s, int e) {
				//Instead of "reduce(0, Math::addExact)" you can use sum().
				Integer result = IntStream.rangeClosed(s, e).map(Utils::getSumOfDigits).sum();
				
				System.out.println(result);//40
				
			}
			
}