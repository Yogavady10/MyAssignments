package testleaf.challenge;

public class Day2 {
	public int lenofString(String str) {
		int len = str.split(" ").length;
		String[] s = new String[len];
		for(int i = 0; i < len ; i++) {
			s[i] = str.split(" ")[i];
		}
		int x = s[len-1].length();
		System.out.println("The last word is \"" + s[len-1] + "\" is with the length");
		return x;
	}
	public static void main(String[] args) {
		Day2 d = new Day2();
		
		int a = d.lenofString("Hello World");
		System.out.println(a);
		
		int b = d.lenofString("fly me  to  the moon");
		System.out.println(b);
		
		int c = d.lenofString("luffy is still joyboy");
		System.out.println(c);
	}
}
