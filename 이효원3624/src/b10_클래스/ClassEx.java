package b10_Ŭ����;

/*
 * 
 * �ڷ����� ����
 * 1. �Ϲ��ڷ���(int, double, char, boolean)
 * 2. �����ڷ���(Ŭ����, �迭) -> String, Phone, Student, Car, �迭[] 
 * 
 */

// class ��� �ϰų� ���� ����ų� ���� ����̶���
class Phone {
	private String company; 
	private String model;
	private String color;
	private String newAgency;
	private int d_ram;
	private String phoneCase;

	public Phone() {
		System.out.println("���ο� phone�� �����Ͽ����ϴ�.");
	}
	
	public Phone(String company) {
		System.out.println("�ι�° �����ڷ� ���� Phone");
		this.company = company;
	} // System.out.println(new Phone("Apple"));���� �Է��ϸ� �ι�����¼�� ��
// �����ε� �����ε�
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
//	new phone�� ������� ���;� ����� �����µ� �갡 ������� �������� 
//	������ �ؾ���.. new phone�̶�� ������	
//	�����ڰ� ȣ���
}
public class ClassEx {
	public static void main(String[] args) {
//		����Ŭ�󽺸����� ���� //		��ӹ����Ű� �������̽� ����
		System.out.println(new Phone("Apple"));//new�ϰ����//�޸��ּ� 16������ ����//�ּҸ�����~!~!~!
		Phone p = new Phone(); //
		Phone p2 = new Phone();
		
//		p.model = "iphone"; // �̷��� �ٷ� ���� �� ���� //�ٸ� Ŭ������//�׸��� ���� private�̶�
//		p2.model = "galaxy";
		
		
//		get set ������
		p.setModel("iphone"); //���� ����(����)�ϴ� ���̱� ������ ���ϰ��� ����.
		
		p.getModel();//�ܼ��� Ŭ���� ������ ���� ���� �������� ���� ���̱� ������ ������ ������ �Ű������� ����. //���ּҿ��ִº����ǰ������������
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
