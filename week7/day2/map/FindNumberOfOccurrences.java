package week7.day2.map;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurrences {
	//Assignment2: FindNumbersOccurances

		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */

		/*
		 * Psuedcode:
		 * 
		 * a) Create Map -> TreeMap
		 * b) For loop -> each number -> add to the map
		 * c) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
		int length = arr.length;
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < length; i++) {
			int count = 1;
			for(int j = 0; j < length; j++){
				if(arr[i] == arr[j]) {
					map.put(arr[i], count);
					count++;
				}
			}
		}
		System.out.println("Map : " +map);
	}

}
