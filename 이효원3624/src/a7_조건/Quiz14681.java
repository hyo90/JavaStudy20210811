package a7_����;

import java.util.Scanner;

public class Quiz14681 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("x�� : ");
		int x = in.nextInt();
		
		System.out.print("y�� :�� ");
		int y = in.nextInt();
		
		
		if(x > 0 && y > 0 ) {
			System.out.println("1��и�");
		}else if(x < 0 && y > 0) {
			System.out.println("2��и�");		
		}else if(x < 0 && y < 0) {
			System.out.println("3��и�");
		}else if (x > 0 && y < 0) {
			System.out.println("4��и�");
		}else {
			System.out.println("�� ���� 0");
		}
	}

}
