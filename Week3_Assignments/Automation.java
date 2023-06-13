package week3.assignments;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.python();
		obj.ruby();
		obj.Selenium();
	}

@Override
	public void Java() {
		System.out.println("Unimplemented method: This is Java");
	}

	@Override
	public void ruby() {
		System.out.println("Unimplemented method:This is Ruby");
	}

	@Override
	public void Selenium() {
		System.out.println("Unimplemented method:This is Selenium");

	}

}
