package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String 기본제공 클래스 (동생)
		// Scanner 외부 클래스 (친구)
		
		// 자동 IMPORT		
		// CTRL + SPACE BAR -> 하나의 클래스 IMPORT
		// CTRL + SHIFT + 0 -> 모든 클래스 IMPORT
		
		Scanner Input = new Scanner (System.in);
			
		System.out.println("숫자 2개를 입력해주세요. ");
		
		System.out.print("첫번째 수 : ");
		String str = Input.nextLine();
		
		System.out.print("두번째 수 : ");
		String str2 = Input.nextLine();
		
		int i = Integer.parseInt(str);
		int i2 = Integer.parseInt(str2);
		
		System.out.print("결과 : ");
		System.out.println(i + i2);
		
	
//		next = space bar 가 enter를 만나면 그때까지의 값만 입력 됨 / 단어만!! 적용함
//		String 변수명은 다르지만 입력받는 행위는 동일함
		
//		System.out.println(str + str2);
//		결과를 숫자로 바꾸려면 형변환을 해조야함 (다운캐스팅!!)
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
