package a4_����ȯ;

public class Conversion {

	public static void main(String[] args) {
//		��ĳ����
//	 	1. ���� -> ����
		char c = 'A';
		int i_c = c;
//		int i_c = (int)c; <-�̷��Ե� ���� / ��ĳ�����̶� �������̶� ��������
		System.out.println("���� -> ���� : " + i_c);
		
//		2. ���� -> �Ǽ�
		int num = 100;
		double d_num = num;
		System.out.println("���� -> �Ǽ� : " + d_num);
		
//		3. ���� + ����
		System.out.println("���� + ���� : " + (c + num));
//		c�� ��ĳ����...
		
		
//		�ٿ�ĳ����
//		1. ���� -> ����
		int i = 67;
		char c_i = (char)i;
//		char c_i = (char)i; <- �̷��� ǥ�� !! 
		System.out.println("���� -> ���� : " + c_i);

//		2. �Ǽ� -> ����
//		����(num2) �Ǽ�(d_num2)
		double d_num2 = 3.14;
		int num2 = (int)d_num2;
		System.out.println("�Ǽ� -> ���� : " + num2);
		
		
		
	}

}
