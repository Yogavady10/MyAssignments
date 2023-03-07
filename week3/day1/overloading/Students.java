package week3.day1.overloading;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID :" +id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("ID : " +id);
		System.out.println("Name : " +name);
	}
	
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("Email : " +email);
		System.out.println("Phone Number : " +phoneNo);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(1234);
		s.getStudentInfo(1234, "Yogavady");
		s.getStudentInfo("yogavady@gmail.com", 8876543210L);
	}
}
