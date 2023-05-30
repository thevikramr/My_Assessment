package week5.day1;

public class studentDetails {
	public void getID(int id) {
	}
	public void getstudentDetails(String name) {
		System.out.println("viiki");
	}
	public void getstudentDetails(int registerNo, String email) {
		System.out.println(registerNo +"  " +email);
	}
	public void getstudentDetails(long mobileNum, String address) {
		System.out.println(address);
		System.out.println(mobileNum);
	}
	public static void main(String[] args) {
		studentDetails det=new studentDetails();
		det.getstudentDetails("vikki");
		det.getstudentDetails(20757,"vikki@gmail.com");
		det.getstudentDetails(9182838475L, "chennai");
	}
}
