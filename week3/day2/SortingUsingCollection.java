package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		// get the length of the array		
		int len = str.length;
		
		// sort the array			
		Set<String> s = new TreeSet<String>();
		for(String st : str) {
			s.add(st);
		}
		
		// Iterate it in the reverse order
		List<String> list = new ArrayList<String>(s);
		for(int i = list.size()-1; i >= 0; i--) {
			// print the array
			System.out.println(list.get(i));
		}
		// Required Output: Wipro, HCL , CTS, Aspire Systems	
			
	}
}
