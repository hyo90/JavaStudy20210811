package b11_�迭;

/**
 * 
 * Array(�迭)
 * ���� �ڷ��������� ���� ","(�Ϲ�,����)
 * index(�ε���)
 * index ������ ��ȣ = [] ���ȣ
 * ������ 0���� ������ !!!!!!!
 */

public class ArrayEx1 {
	
	
	public static void main(String[] args) {
		//��������
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		
//		�迭 ���� �� ���� ���
//		1.
		int[] num = new int[100]; //��Ʈ������ �����~~ ��Ʈ���� �̸��� num�̴�//��Ʈ���ټ���������
		
//		num = new int [] {10, 20, 30, 40}; // <-�̷��� �� �� ���� ������ �����
		
//		num = {10, 20, 30, 40,}; �̷��Ծ���ȵ�
		
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;

		for(int i = 0; i < 100; i++) { //i�� 100�� �Ǳ� ������ �����ϸ鼭 i���� 10�� ���
			num[i] = i*10;
		}
		for(int i = 0; i < 100; i++) { //i���� 0 100�� �Ǳ� ������� �����ϴ� ���� �ʾ�� �شϾƷ���;���߷�;�̳���;�� 
			System.out.println(num[i]);
		}
		
		
		
		
//		2.
		int[] arr_i = new int[] {10, 20, 30, 40, 50, 0, 0, 0, 0}; // �̷����ϸ� �迭���鋚���� ������ �����ϰԵ� ��//0�־ ����Ȯ��
		
		int[] arr_i2 = {10, 20, 30, 40, 50};		
		
		
		for(int i= 0; i < 5; i++) {
			System.out.println(num[i]); //i�� 0���� ���鼭 ���ڰ� �ٲ�
		}
		
		
	}
		
		
	

	}



