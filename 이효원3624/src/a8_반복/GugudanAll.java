package a8_�ݺ�;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� �ܼ� : ");
		int a = sc.nextInt();
		
		System.out.print("������ �ܼ� : ");
		int a2 = sc.nextInt();
		
//		for (int i = a; i < a2+1; i++) { for�� ���������� ���� �̷��� �� �Ⱦ� �̷��Ծ��Ÿ� while�� �����Ԥ�.��
		for (; a < a2+1; a++) {
						 
		System.out.println(a + "��");
			 
		  for (int j = 0; j < 9; j++) {
		 	   int j2 = j + 1;
			  
	    System.out.println(a + "x" + j2 + "=" + a * j2);
				  
			 }
		}
		

		
		
		
	}

}
