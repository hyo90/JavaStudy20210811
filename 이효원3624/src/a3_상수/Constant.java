package a3_상수;

public class Constant {

	
		/**
		 * 
		 * 상수
		 * 1. final 예약어를 자료형 앞에 사용하여야 한다.
		 * 2. 이름은 모두 대문자여야 한다.
		 *   
		 * 
		 * 
		 */
	
	public static void main(String[] args) {
		int maxNum = 100;
		final int MAX_NUM = 200;
		
		maxNum = 200;
//		maxNum = 200; <-일반변수 바꿀수있음 (지속적인 선언 가능)
//		MAX_NUM = 200; <-상수는 한번선언하면 끝 (변하지 않는 값) (폴더 경로 값도 사용 가능)
		
		System.out.println("일반변수: " + maxNum);
		System.out.println("상수: " + MAX_NUM);
//		위의 예시처럼 쓸 수 있다! 문자열이랑 같이 사용 가능
		
		
		
		
	}

}
