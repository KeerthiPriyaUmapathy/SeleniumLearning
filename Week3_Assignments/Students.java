package week3.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID = " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID = " +id +" and Name = " +name);
	}
	public void getStudentInfo(String email, long ph) {
		System.out.println("Student email = " +email +" and Phone number = " +ph);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(162430);
		obj.getStudentInfo(162430, "Keerthi");
		obj.getStudentInfo("123@gmail.com", 9620966645l);
	}

}
