package b19_����ƽ;

public class Student {
	private static int student_static_code = 20210000;
	private int student_code;
	private String name;
	
	
	//������
	public Student(String name) {
		student_code = student_static_code++;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�й� : " + student_code);
		System.out.println("�̸� : " + name);
		System.out.println();
	}

}

// �������ٰ� static��... 
// �л��� ���鋚���� �ڵ����� 1�� ����
// �� ����??????????
