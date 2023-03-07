package week3.day1.string;

public class RemoveDuplicates {
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] str = text.split(" ");
		String s = "";
		
		for(int i = 0; i < str.length; i++) {
			int count = 0;
			for(int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					count += 1;
				}
			}
			if(count <= 1) {
				s = s + str[i] + " ";
			}
		}
		System.out.println(s);
	}
}