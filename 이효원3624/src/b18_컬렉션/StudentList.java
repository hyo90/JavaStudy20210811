package b18_�÷���;

import java.util.List;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>(); //Student�� ���� �� �ִ� List
		
		for(int i = 0 ; i < 10 ; i++) {
			sList.add(new Student("������" + i, 202100 + i)); // �����ͺ��̽����� �����;��� !!! 
		}

		for(Student s : sList) {
			System.out.println(s);
		}
		
//		System.out.println(sList);
	
		Student s = sList.remove(3);
		System.out.println(s);
	
	}
	
}

// ����� ���� ������
// �����ͺ��̽��ҋ�

	
	
