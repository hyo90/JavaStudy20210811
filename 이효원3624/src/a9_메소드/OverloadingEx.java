package a9_�޼ҵ�;

public class OverloadingEx {//�̰� ���ι��̶�� �����ϰ� ���� �̰Ž� �����ε�
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {
		int result = Integer.parseInt(num1) + num2;
		return result;
	}
	
	public int add(int num1) {
		int result = num1 + num1;
		return result;
	}
	
	
	public int mu1(int num1, int num2) {
		int result = num1 * num2 ;
		return result;
		
	}
	
	public double add(int num1, double num2) { //num 1 int num2  doubl
		double result = num1 + num2; //double -> int ����ؼ� 
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
//	 �̷��� ���� c���� �ٸ��Ծ���
//	��ü����� �����a_a_a_a_A_a_a_a_A_A_A_A-a-a-a-a-a--a-a_A-a_a_Aa-a_A_A-a(*A_
//	 string -> double -> int -> char

	public void mainMethod() {
		int numberSum = add(20);
		double numbermu1 = mu1(2, 10.5); //��ȯ�� double�� �޾ƾ��ϴµ� 
		System.out.println("�� ���� ����? " + numberSum);
		System.out.println("���� : " + numbermu1);
		
//		 ���� ���ڸ� �ؿ����� int�� �����ɷ� ����� ��µ�
//		�̸��� ���� �Ű������� �ڷ����� �ٸ����� �ٽ� �����ҋ� ����
//		public void�� �����?
//		public int �� �����Է�?
	}

//	�ְ�ް��ϴ� �ڷ����� ������ ���κ����� �ٲٰ�
//	�ڷ����� �ٸ��� �ѹ��޶� ��������
	public int add2(int num1, int num2) { //�޼���� ���� ������ �����ϸ� �ȵ� //����?�������� �������ָ� ��������
		int result = num1 + num2;
		return result;
	}
	
	
	
//	overloading�̶� ���� ����ε� �� ����� �ٸ������� �ϴ� ��
	
// static ���� ����	
//	�̰� ���ٰ� �����ϰ� ���� Ŭ�������� ���ι� ����!! (static void)
	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx(); //�޼ҵ� �ϴµ��� �ᤵ �Ӿ�
		main.mainMethod();
		
		
		
		
		
	}

}
