package week1.day2;

public class IsPrime {
	/*
	 * Check whether given number (num) is prime or not
	 */
	private void checkIsPrime(int num) {
		for(int i = 2; i <= num-1; i++) {
			boolean flag = false;
			for(int j = 2; j <= 5; j++) {
				if(i != j) {
					if(i%j == 0) {
						flag = true;
						break;
					}
					if(i%j > 0) {
						continue;
					}
				}
			}
			if(flag) {
				System.out.println("Non-Prime number: " +i);
			}
			else {
				System.out.println("Prime number: " +i);
			}
		}
	}
	
	public static void main(String[] args) {
		IsPrime p = new IsPrime();
		p.checkIsPrime(20);
	}
}
