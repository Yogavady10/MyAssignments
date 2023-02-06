package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNo = 0;
		int secondNo = 1;
		int sum = 0;
		
		System.out.println("Fibanocci Series: ");
		
		for(int i = 0; i < 11; i++) {
			System.out.println(firstNo);
			sum = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = sum;
			//System.out.println(sum);
		}
	}
}
