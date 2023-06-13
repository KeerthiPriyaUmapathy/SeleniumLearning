package week3.assignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("This is Desktop Size");
	}

	public static void main(String[] args) {

		Desktop desObj = new Desktop();
		desObj.computerModel();
		desObj.desktopSize();
	}
}
