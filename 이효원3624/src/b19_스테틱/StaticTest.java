package b19_����ƽ;

public class StaticTest {

	public static void main(String[] args) {
		Connector.connect();
		Integer.parseInt(null); //�̷��� ��� static���� ȣ���ޱ����� �� �� ����
		
		Student s1 = new Student("������");
		Student s2 = new Student("�����");
		Student s3 = new Student("������");
		Student s4 = new Student("������");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		
		
//		Integer i = new integer(10);
//		i.parseInt(null); �̷��� ��������
		
//		connector.�ϸ� ȣ�� �޼��尡 ��
//		sǥ�ô� static �̶�� ��
//		Integer. �ϸ� ���� ȣ�� �޼��尡 ��.. �� ������ �⺻ Ŭ�󽺶󼭾�
		
//		�Ź� �Ȱ��� ������ ������ static ��
//		�ٸ� ������̶�� ���������� 
		
		

	}

}
