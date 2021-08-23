package a8_반복;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 * *******
		 */
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("별의 개수 : "); 
		int star = in.nextInt(); //여기서 갯수를 넣으면
		
		for(int i = 0; i < star; i++) { //i가 현재 0인데 현재 j도 0 
			for(int j = 0; j < i + 1; j++) { //i의 값을 가져와서 i +1만큼 더하고 조건 반복
				System.out.print("*"); //옆으로 쭉 붙음			
			}
			System.out.println();
		}
		
		
		
		
		

		
	}

}
