package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name = "YOGAVADY";
		
		char[] c = name.toCharArray();
		
		Set<Character> chr = new HashSet<Character>();
		
		for(char cc: c) {
			if(!chr.add(cc)) {
				chr.remove(cc);
			}
		}
		
		System.out.println(chr);
	}
}
