package week3.day2;

public class Samsung extends AndroidTV{

	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
	}
	
	public static void main(String[] args) {
		Samsung  s = new Samsung();
		s.openApp();
		s.playVideo();
	}
}
