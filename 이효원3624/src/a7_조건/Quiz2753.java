package a7_조건;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		해당년도 4의 배수이고 100의 배수는 아니거나 400의 배수이다.
		
		int year = in.nextInt();
		
		int result;
		
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) { // year이 4로 나누었을때 0이냐, 100으로 나누었을때 0이 아니여야한다, 이고~ && 또는 ||
		          System.out.println("윤년입니다.!!");	
		   } else {
			   	   System.out.println("윤년이 아닙니다.!!");
		   }		
		
		
	}

}
