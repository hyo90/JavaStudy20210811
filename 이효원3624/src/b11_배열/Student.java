package b11_배열;

public class Student {

	private int Student_code; 
	private String Student_name;
	
	
	
	//	 ALT + SHIFT + S = GET / SET
	public Student(int student_code, String student_name) {
		super();
		Student_code = student_code;
		Student_name = student_name;
	}
	
	public int getStudent_code() {
		return Student_code;
	}
	public void setStudent_code(int student_code) {
		Student_code = student_code;
	}
	public String getStuden_name() {
		return Student_name;
	}
	public void setStuden_name(String Student_name) {
		Student_name = Student_name;
	}
	
	
	public void showInfo() {
		System.out.println(Student_name + "학생의 교유 코드번호(학번)는" + Student_code + " 입니다.");
	}

	public void readBook() {
		System.out.println(Student_name + "학생이 책을 읽습니다.");
	}
	

	
}
