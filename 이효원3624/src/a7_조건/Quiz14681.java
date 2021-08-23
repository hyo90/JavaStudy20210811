package a7_조건;

import java.util.Scanner;

public class Quiz14681 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("x축 : ");
		int x = in.nextInt();
		
		System.out.print("y축 :ㅣ ");
		int y = in.nextInt();
		
		
		if(x > 0 && y > 0 ) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");		
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if (x > 0 && y < 0) {
			System.out.println("4사분면");
		}else {
			System.out.println("두 값이 0");
		}
	}

}
