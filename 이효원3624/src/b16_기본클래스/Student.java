package b16_기본클래스;

public class Student {
	
	private String name;
	private String school;
	private int year;
	private int group;
	private int number;
	private int studentNumber;
	private String addr;
	private String phoneNumber;

	
//	alt + shilft + s = construct usig
	
	public Student(String name, String school, int year, int group, int number, int studentNumber, String addr,
			String phoneNumber) {
		super();
		this.name = name;
		this.school = school;
		this.year = year;
		this.group = group;
		this.number = number;
		this.studentNumber = studentNumber;
		this.addr = addr;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNumber;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj.hashCode() == this.hashCode()) {
			return true;
		}
		return false;
	}



	//alt + shift + s = toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + ", year=" + year + ", group=" + group + ", number="
				+ number + ", studentNumber=" + studentNumber + ", addr=" + addr + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
}
