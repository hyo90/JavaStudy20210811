package a8_반복;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수를 입력해 주세요 : ");
		int a = sc.nextInt();
		
		System.out.println(a + "단");
		for (int i = 0; i < 9; i++) {
 			 int i2 = i + 1;
 			 	
			     System.out.println(a + " x " + i2 + " = " + a * i2);
		} 		
		System.out.println();
		
		
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6 == 2*3"); 이런 결과가 나와야함
//		System.out.println("2 x 4 = 8 == 2*4"); 변화되는 자리 확인 / x 숫자 변환 = 숫자 변환 변화되는수에 변수나 수식 들어와야함
		
//		int i = 0; (전역변수로 쓰면 쓸 수 없음 지역변수로 ㅋㅋ)
		
//		System.out.println("2 x "(고정) + 1 + " = "(고정) + 2*1);
		// for문은 지역변수 (구문안에들어가는)
//		System.out.println();
//		
//		System.out.println("3단");
//		for (int i = 0; i < 9; i++) {
// 			 int i2 = i + 1;
// 			 	
//			     System.out.println("3 x " + i2 + " = " + 3*i2);
//		} 	
//		System.out.println();
//		
//		
//		
		
		

		
//		전역변수  / 지역변수 
//		for문작업할때 i변수를 많이 씀 각 지역마다 인정되는 
//		for 안에 for가능
//		코끼리코 열번돌아~~ 한바퀴돌고 박수치고 x 10번 이게 for문 안에 for문
		
//		
//		int i = 0;
//		
//		 while (i > 9) {
//			 int i2 = i + 1;
//				System.out.println("2 x " + i2 + " = " + 2 * i2);
//			 
//			 
//			 i++;
//			 
//			 
//		 }
			

					
		
	
		
	}

}
