package week3.day1.overloading;

public class MyCalculator extends Calculator{
//  - Create another class called MyCalculator 
//  - Create a main method and access the methods from Calculator class
	public static void main(String[] args) {
		MyCalculator c = new MyCalculator();
		c.sub();
		c.mul(5, 2);
		c.mul("Input : ", 3, 5.2f);
	}
}
