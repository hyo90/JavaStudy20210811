package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		
//		Student kim; //�̷��� �ϸ� studen Ŭ������ �����Ǿ��� ��ü�� ��ġ�� ���� �� �ִ� kim!! �л��� ���� �� �ִ� ���� ��ü�� ���� �� �ִ� �ּ�!! �޸��ּ�!! �ڷ����� ���⋚��
		
		Student kim = new Student("������", "USA����Ƽ", 4);
		Student lee = new Student("��ȿ��", 2);
		Student park = new Student("��ȣ��", "�ڸ��ƾ���Ƽ", 3);
		
		
			
//		null �ּҰ� ���ٶ�� �� ()�ȿ� �ּҰ� //new�ϴ� ���� ���� ~~ ���� heap�̶�� �޸� �ּҿ� ���� (���̸޸��ּ�?)
//		�¾�� ��  �̸� �ο��� �ϰ�ʹ�  new student(�̸�);�־���� �Ű�����ó�� �������ٲ���
//		�̸��� �ο��� ���� student clss�� �ο���
		
//		kim.name = "������";//	.�� �ش� �޸� �ּҰ��� �����Ѵٶ�� �Ѵ�.(��)
		
		kim.showInfo(); //�� �л��� ����ϰٴ� // shoinfo(10,20)�� �ִ´��Ҷ� int�� �Ű������� �ʿ��� �װ� class����������(Ʋ)
		lee.showInfo();
		park.showInfo();
		
		Integer i = new Integer(100);//�ּҸ�����մ�..
		
		System.out.println(kim.hashCode()); //kim�� ������.. �ƹ��͵� �Ȱ����� ������ null // null��  ���� �ְ� ����ϸ� ����� null //java.lang.NullPointerException <- �� ��°��� ���ֺ��ԵǷ��뤱
		System.out.println(i.hashCode());//hashcode : �ּҰ� //�ּҰ� ����� //
		
		
		kim.getFreebies();
		lee.getFreebies();
		
		
		
		
			
		
	}

}

//ĸ��ȭ�Ұ���
//�����ڰ����� ��Ȯ�ϰ� �̾߱��Ҳ���
//studentText class
//ĸ��ȭ
//�����ڴ� �޼ҵ�� �Ȱ��� �����δ�