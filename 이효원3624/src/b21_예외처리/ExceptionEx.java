package b21_����ó��;

/**
 * 
 * Exception(����)
 * 1.����(�ҽ��ڵ�) ����
 * 2.������ ����
 * 3.���� : �����ڰ� �ǵ��Ѵ�� �۵����� ���� �� != �������� �� �ٸ�
 * 
 * ������ ������ ���α׷� ���ư� �� �ֵ��� (�����س��� �α׷� �����)
 *
 *  
 *  throws(ȣ���� ��ġ�� ���� �̷��)
 *  
 *  
 */

public class ExceptionEx {
	public static void arrTest() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[5]; //�迭ũ��� 5��
		
		for(int i = 0; i <= 5; i++) { // <=�̸� 5���� 6���� �ݺ��̱⶧�� exception�� �㲨�� //ũ�⸸ŭ�� ����� �� 
			arr[i] = i;
			System.out.println(arr[i]);
			}
	}

	public static void main(String[] args) throws Exception { //main���� trhwos(�̷��) jvm�� ȣ���Ԥ���
		
		// try  ������ ���� ���� �� ���� �ڵ带 ��������  catch ������ ������ ĳġ�� ���� ���ܸ� ���� 
		try {
			ExceptionEx.arrTest();
		} catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (SecurityException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (Exception e) { //Exception�� ��� ���ܸ� �� �޴� �ֻ�� Ŭ����?�� �ڿ������� ��ĳ����..��¼��... 
			e.printStackTrace(); 
		}
		
		System.out.println("���α׷� ����.");
		
	}
}
	


