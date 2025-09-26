package classes;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student(1002, "이정후", 1);

		st1.studentId = 1001;
		st1.name = "김기용";
		st1.grade = 2;

		st1.displayInfo();
		st2.displayInfo();
	}

}
