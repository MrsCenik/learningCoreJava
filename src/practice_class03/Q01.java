package practice_class03;

public class Q01 {

	public static void main(String[] args) {
		/*Write a method with given two strings and get on the console Javaisagoodlanguage
	        * str="Javalanguage"
	        * str1="isagood"
	        */

		
		String str= "Javalanguage";
		String str1= "isagood";
		
		System.out.println(merge(str,str1));
		
		
	}

	private static String merge(String str, String str1) {
		return str.substring(0,4).concat(str1)+str.substring(4,str.length());
		
		
	}
}
