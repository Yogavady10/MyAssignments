package week3.day1.inheritance;

public class Suzuki extends Bike{
	public void bikeName() {
		System.out.println("Bike name is Suzuki");
	}

	public static void main(String[] args) {
		Suzuki s = new Suzuki();
		s.typesOfVehicle();
		s.hasStand();
		s.bikeName();
	}
	
}
