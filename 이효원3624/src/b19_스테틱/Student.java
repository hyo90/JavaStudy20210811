package b19_스테틱;

public class Student {
	private static int student_static_code = 20210000;
	private int student_code;
	private String name;
	
	
	//생성자
	public Student(String name) {
		student_code = student_static_code++;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + student_code);
		System.out.println("이름 : " + name);
		System.out.println();
	}

}

// 변수에다가 static을... 
// 학생을 만들떄마다 자동으로 1씩 증가
// 왜 가능??????????
