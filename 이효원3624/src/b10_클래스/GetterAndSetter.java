package b10_Ŭ����;

public class GetterAndSetter {
	
	public static void main(String[] args) {
		
		Student Kim = new Student();
				
//		kim.name = "������";
//		Setter()

		Kim.setName("������"); //student��� Ŭ������ ���� name��
		Kim.setSchoolName("�ڸ��ƾ���Ƽ��ī����");
		Kim.setYear(5);
		
		
//		System.out.println(Kim.getName()); //studen���� getname Ŭ������ ���� ���ϰ��Է���
//		System.out.println(kim.get);

		Kim.showInfo();
	}
	

	

}
