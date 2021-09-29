package b21_예외처리;

/**
 * 
 * Exception(예외)
 * 1.문법(소스코드) 오류
 * 2.컴파일 오류
 * 3.버그 : 개발자가 의도한대로 작동되지 않을 때 != 오류랑은 좀 다름
 * 
 * 오류가 나더라도 프로그램 돌아갈 수 있도록 (보류해놓고 로그로 냄긴다)
 *
 *  
 *  throws(호출한 위치로 예외 미루기)
 *  
 *  
 */

public class ExceptionEx {
	public static void arrTest() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[5]; //배열크기는 5개
		
		for(int i = 0; i <= 5; i++) { // <=이면 5까지 6번의 반복이기때에 exception이 뜰꺼임 //크기만큼만 결과값 뜸 
			arr[i] = i;
			System.out.println(arr[i]);
			}
	}

	public static void main(String[] args) throws Exception { //main에서 trhwos(미루면) jvm을 호출함ㅋㅋ
		
		// try  오류가 나서 종료 될 법한 코드를 넣음ㅋㅋ  catch 조건을 넣으면 캐치가 받음 예외를 받음 
		try {
			ExceptionEx.arrTest();
		} catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		} catch (SecurityException e) {
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		} catch (Exception e) { //Exception이 모든 예외를 다 받는 최상외 클래스?라서 자연스럽게 업캐스팅..어쩌구... 
			e.printStackTrace(); 
		}
		
		System.out.println("프로그램 종료.");
		
	}
}
	


