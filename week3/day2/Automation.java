package week3.day2;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public void selenium() {
		System.out.println("Selenium");
	}

	public void java() {
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public static void main(String[] args) {
		Automation a = new Automation();
		a.java();
		a.selenium();
		a.python();
		a.ruby();
	}
}
