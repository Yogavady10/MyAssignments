package testleaf.challenge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day9 {
	//	Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
	//	Example 1:	Input: s = "leetcode"	Output: 0
	//	Example 2:	Input: s = "loveleetcode" 	Output: 2
	//	Example 3:	Input: s = "aabb"	Output: -1
	private void nonRepetitiveChar(String str) {
		char[] c = str.toCharArray();
		Set<Character> s = new LinkedHashSet<Character>();
		Set<Character> repSet = new LinkedHashSet<Character>();
		for(int i = 0; i < c.length; i++) {
			if(!s.add(c[i]))
				repSet.add(c[i]);
		}
		s.removeAll(repSet);
		List<Character> list = new ArrayList<Character>(s);
		if(list.size() > 0)
			System.out.println("Index of first non repetitive character of " +str+" is : " +str.indexOf(list.get(0)));
		else
			System.out.println("Index of first non repetitive character of " +str+" is : -1");
	}
	public static void main(String[] args) {
		Day9 d = new Day9();
		d.nonRepetitiveChar("leetcode");
		d.nonRepetitiveChar("loveleetcode");
		d.nonRepetitiveChar("aabb");
	}
}
