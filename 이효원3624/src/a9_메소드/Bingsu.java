package a9_�޼ҵ�;

public class Bingsu {
	
//	toMAke - �޼ҵ� 
//	���Ḧ ������ ? 
	String toMake (String material, int materialCount, String material2) { //tomake ģ�� �Ф� ģ�����Ҽ��մµ��� / ��� int
		String bingsu = material + materialCount + "����" + material2 + "�� �� ����";
		return bingsu;
	}

	void voidTest() {
		System.out.println("���̵� �׽�Ʈ �޼ҵ�");
	}
	
	
	public static void main(String[] args) {
//		void main(String[] args) voil �����ϴ� ��ȭ�Ұ����� �����ϸ� ��
//		static �����ϴ� ���� 
		
		Bingsu b = new Bingsu(); //g���� ���� Ŭ����
		
		String material = "����";
		
		String bingsu1 = b.toMake(material,10,"����");
//		ctrl + �޼���?������
		String bingsu2 = b.toMake("û����",10,"����");
		String bingsu3 = b.toMake("����",10,"����");
		String bingsu4 = b.toMake("����",10,"����");
		
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		
		
		
		b.voidTest();
		
		
	}

}
