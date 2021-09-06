package b11_배열;

/**
 * 
 * Array(배열)
 * 같은 자료형끼리의 묶음 ","(일반,참조)
 * index(인덱스)
 * index 연산자 기호 = [] 대괄호
 * 순서는 0부터 시작함 !!!!!!!
 */

public class ArrayEx1 {
	
	
	public static void main(String[] args) {
		//수동ㅋㅋ
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		
//		배열 선언 및 대입 방법
//		1.
		int[] num = new int[100]; //인트형끼리 묶어라~~ 인트형의 이름은 num이당//인트형다섯개를만듦
		
//		num = new int [] {10, 20, 30, 40}; // <-이렇게 쓸 수 없음 위에가 사라짐
		
//		num = {10, 20, 30, 40,}; 이렇게쓰면안됨
		
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;

		for(int i = 0; i < 100; i++) { //i가 100이 되기 전까지 증가하면서 i값에 10을 고배
			num[i] = i*10;
		}
		for(int i = 0; i < 100; i++) { //i시작 0 100이 되기 전까ㅣ지 증가하는 값을 너어라 멈니아러미;ㄴ야러;미낭러;ㅣ 
			System.out.println(num[i]);
		}
		
		
		
		
//		2.
		int[] arr_i = new int[] {10, 20, 30, 40, 50, 0, 0, 0, 0}; // 이렇게하면 배열마들떄부터 갯수를 지정하게됨 ㅠ//0넣어서 공간확보
		
		int[] arr_i2 = {10, 20, 30, 40, 50};		
		
		
		for(int i= 0; i < 5; i++) {
			System.out.println(num[i]); //i가 0부터 들어가면서 숫자가 바뀜
		}
		
		
	}
		
		
	

	}



