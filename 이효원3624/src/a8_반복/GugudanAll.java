package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("시작 단수 : ");
		int a = sc.nextInt();
		
		System.out.print("마지막 단수 : ");
		int a2 = sc.nextInt();
		
//		for (int i = a; i < a2+1; i++) { for문 생략가능함 보통 이렇게 잘 안씀 이렇게쓸거면 while을 쓴다함ㅋ.ㅋ
		for (; a < a2+1; a++) {
						 
		System.out.println(a + "단");
			 
		  for (int j = 0; j < 9; j++) {
		 	   int j2 = j + 1;
			  
	    System.out.println(a + "x" + j2 + "=" + a * j2);
				  
			 }
		}
		

		
		
		
	}

}
