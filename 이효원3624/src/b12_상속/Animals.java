package b12_���;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human(); //�����ڸ����
		Tiger t = new Tiger();
		Eagle e = new Eagle();

		h.move();
		t.move();
		e.move();
		
//		�迭�� ������ٲ���
//		��ĳ���� / �θ�� �ڽĳ�
		Animal[] a = new Animal[3]; //�����̶�� �迭 a���� = �� ���� �ε��� 3�����鲨��
		a[0] = new Human();//��ĳ������ animal�� �θ�Ŭ������  ��ĳ���õǴ°���
		a[1] = new Tiger();
		a[2] = new Eagle();
		
//		for each :ó������ ������ ��뤾 ����, �߰����� ������ �� ���� 
//		for(���� ���� ó�������� ��)
//		for each�� ":"(�ݷ�) �������ξ����� 
		
		for(Animal ani : a) { //animal�̶�� �ϴ� class �������� a�̶�� �迭 ù���� �ε������� ������ �ݺ����Ұſ��� ù�������� ���ʴ�� ���Ծ�
			ani.move(); //ù������ ��� Ÿ�̰� �̱� // �ε����� �������־����.
		}
		
//		for each(:) Ǯ� ���� �̷���, ���ڸ� �ٲٸ� �߰����� ������ �� ����
//		for(int i = 0; i < a.length; i++) {
//		Animal ani = a[i]; = //ani.move();
//			ani.move();
//		}
		
		
//		�������� ����Ʈ�� ��ĳ���� & �ٿ�ĳ����
//		��ð����ҰԿ�
//		�������صſ�...
//		���� �ʹ� �����ֽôµ� ....���ظ� �ſ�....
//		Ȱ������ؿ�
		
		
		
		
		
//		int i = 10;
//		double d = i; // ��ĳ���� int ->double //����������ȯ
			
		
//		father f = new son(); <-�̰Ǿȵ� �������� �޶� �ȵ�....
//		������ ���� ���� ���������� �����Ѱ��� ��ĳ���� �ٿ�ĳ����
//		
		
		
		
		
	}
}
class Human extends Animal{//Ŭ���� �޸��� animal�̤����� Ŭ������ ��ӹ���
	@Override
	public void move() { //move �� ������
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� ������ ��� ���ϴ�.");
	}
	
}

// �������ϴ°� �ƺ������� �ٹ�����
