package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(); //�޼ҵ��Է��ҋ��� ���� �迭 //������ -> Ŭ������� ����.
		
		kim.name = "���缺";

		kim.showInfo();
		
		Student lee = new Student();; //lee �޸��ּ�
		
		lee.name = "��ȿ��";
		
		lee.showInfo();
		
		System.out.println(kim); //����� �޸� �ּ�
		System.out.println(lee);
		
		
			
		
	}

}

//ĸ��ȭ�Ұ���
//�����ڰ����� ��Ȯ�ϰ��װ����Ұ���
//studentText class
//ĸ��ȭ
//�����ڴ� �޼ҵ�� �Ȱ��� �����δ�