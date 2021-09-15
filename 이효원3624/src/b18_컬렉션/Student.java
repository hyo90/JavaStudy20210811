package b18_ÄÃ·º¼Ç;

public class Student {
	private String name;
	private int StudentCode;
	
	public Student(String name, int studentCode) {
		super();
		this.name = name;
		StudentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public int getStudentCode() {
		return StudentCode;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", StudentCode=" + StudentCode + "]";
	}
	
}
