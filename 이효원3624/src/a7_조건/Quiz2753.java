package a7_����;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		�ش�⵵ 4�� ����̰� 100�� ����� �ƴϰų� 400�� ����̴�.
		
		int year = in.nextInt();
		
		int result;
		
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) { // year�� 4�� ���������� 0�̳�, 100���� ���������� 0�� �ƴϿ����Ѵ�, �̰�~ && �Ǵ� ||
		          System.out.println("�����Դϴ�.!!");	
		   } else {
			   	   System.out.println("������ �ƴմϴ�.!!");
		   }		
		
		
	}

}
