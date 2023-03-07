package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//		Declare a String as "PayPal India"
		String text = "PayPal India";
		
		//		Convert it into a character array
		char[] c = text.toCharArray();
		
		//		Declare a Set as charSet for Character
		Set<Character> sc = new LinkedHashSet<Character>();
		
		//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> duplicate = new LinkedHashSet<Character>();
		
		//		Iterate character array and add it into charSet
		for(char cc : c) {
			if(!sc.add(cc)) {
				//	if the character is already in the charSet then, add it to the dupCharSet
				duplicate.add(cc);
			}
		}

		//		Check the dupCharSet elements and remove those in the charSet
		sc.removeAll(duplicate);
		
		//		Iterate using charSet
		for(char ch : sc) {
			//		Check the iterator variable isn't equals to an empty space
			if(ch != ' ') {
				//		print it
				System.out.println(ch);
			}
		}
	}
}