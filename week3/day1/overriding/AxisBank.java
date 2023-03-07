package week3.day1.overriding;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		System.out.println("Amount Rs.10000");
	}
	
	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
