package week3.day1.inheritance;

public class AshokLeyland extends Truck{
	public void brandName() {
		System.out.println("Truck brand is AshokLeyland");
	}
	
	public static void main(String[] args) {
		AshokLeyland a = new AshokLeyland();
		a.typesOfVehicle();
		a.noOfWheels();
		a.brandName();
	}
}
