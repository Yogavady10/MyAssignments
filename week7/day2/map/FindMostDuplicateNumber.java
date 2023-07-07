package week7.day2.map;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {
	//Find the most duplicate number -> First most duplicate
		/*
		* input: abbaba
		* output: b
		* 
		* 
		*/

		/*
		 * Psuedocode
		 * 
		 * a) Map -> HashMap 
		 * b) String -> ch[] -> Get all the character -> occurance
		 * c) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
	
	public static void main(String[] args) {
		String str = "abbaba";
		char[] ch = str.toCharArray();
		int length = ch.length;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < length; i++) {
			int count = 1;
			for(int j = 0; j < length; j++){
				if(ch[i] == ch[j]) {
					map.put(ch[i], count);
					count++;
				}
			}
		}
		System.out.println("Map : " +map);
	}

}