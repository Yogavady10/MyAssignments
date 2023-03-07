package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Dekstop Size in inches: 1280 x 1024");
	}
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		System.out.println("Single Inheritance");
		d.computerModel();
		d.desktopSize();
	}
}
