package week3.day1.overloading;

public class Calculator {
//    - Create a method sub() with no arguments
	public void sub() {
		System.out.println("sub() with no arguments");
	}
	
//    - Create another method mul() with 2 input arguments of int dataType
	public void mul(int a, int b) {
		System.out.println("Muliply " + a + " and " + b + " is: " +a*b);
	}
//    - Create another method mul() with 3 input arguments of String,int float dataType
	public void mul(String str, int a, float b) {
		System.out.println(str + a + " and " + b);
	}
}
