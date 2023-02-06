package week1.day2;

public class Car {
	
	public int getRegistrationNo() {
		int regNo = 8172;
		return regNo;
	}
	
	private String getOwnerName() {
		String name = "Yogavady";
		return name;
	}
	
	void carModel() {
		System.out.println("Car Model Swift");
	}
	
	public boolean isPunctured() {
		return false;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply() {
		return 1*2*3;
	}
	
	public float divide() {
		float a = 25;
		float b = 4;
		return a/b;
	}
	
	public static void main(String[] args) {
		Car objCar = new Car();
		
		int registrationNo = objCar.getRegistrationNo();
		System.out.println("Registration Number : " +registrationNo);
		
		String ownerName = objCar.getOwnerName();
		System.out.println("Owner Name : " +ownerName);
		
		objCar.carModel();
		
		boolean punctured = objCar.isPunctured();
		System.out.println("Is car punctured : " +punctured);
		
		int subtractNos = objCar.subtract(10, 3);
		System.out.println("Subtract two numbers : " +subtractNos);
		
		int multiplyNos = objCar.multiply();
		System.out.println("Multiply three numbers : " +multiplyNos);
		
		float divideNos = objCar.divide();
		System.out.println("Divide two numbers : " +divideNos);
	}
}