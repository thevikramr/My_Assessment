package week5.day1;

public class Desktop extends computer{
	public void desktopSize() {
		System.out.println("screen size from 18 to 33 inches");
	}	

	public static void main(String[] args) {

		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();


	}

}
