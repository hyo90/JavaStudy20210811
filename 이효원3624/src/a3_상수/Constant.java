package a3_���;

public class Constant {

	
		/**
		 * 
		 * ���
		 * 1. final ���� �ڷ��� �տ� ����Ͽ��� �Ѵ�.
		 * 2. �̸��� ��� �빮�ڿ��� �Ѵ�.
		 *   
		 * 
		 * 
		 */
	
	public static void main(String[] args) {
		int maxNum = 100;
		final int MAX_NUM = 200;
		
		maxNum = 200;
//		maxNum = 200; <-�Ϲݺ��� �ٲܼ����� (�������� ���� ����)
//		MAX_NUM = 200; <-����� �ѹ������ϸ� �� (������ �ʴ� ��) (���� ��� ���� ��� ����)
		
		System.out.println("�Ϲݺ���: " + maxNum);
		System.out.println("���: " + MAX_NUM);
//		���� ����ó�� �� �� �ִ�! ���ڿ��̶� ���� ��� ����
		
		
		
		
	}

}
