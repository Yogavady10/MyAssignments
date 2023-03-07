package week3.day1.string;

public class ChangeOddIndexToUpperCase {
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		String test = "changeme";
		char[] c = test.toCharArray();
		
		String s = "";
		for(int i = 0; i < c.length; i++) {
			if(i % 2 != 0)
				s = s + Character.toUpperCase(c[i]);
			else
				s = s + c[i];
		}
		System.out.println(s);
	}
}
