package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <자료형>
		 * 논리형(boolean) = true, false
		 * boolean 변수명 = true;
		 * boolean 변수명 = false;
		 * 
		 * 
		 * 문자형(char) 캐릭터 = a ~ z, 한글(1글자만)
		 * char 변수명 = 'a'; <-작은따옴표사용, 한글자만!ㅋㅋ
		 * char 변수명 = '가';
		 * char 변수명 = '1';
		 * char 변수명 = '$';
		 * 
		 * 문자열자료형(string) 스트링 = "문자열을 저장할 수 있습니다."
		 * string 변수명 = "안녕하세요. 이효원입니다.";
		 * 
		 * 정수형(int) Integer 인티저~~~ = 0 ~ 10 (10진수를 표현)
		 * int 변수명 = 100;
		 * 
		 * 실수형(double) = 0.0 ~ 0.999..... 실수단위 (소숫점) 표현
		 * double 변수명 100.08776; 
		 * 
		 * 
		 * 
		 */

		
		int year = 1990;
		int month = 11;
		int day = 10;
		
		char f = '이';
		char s = '효';
		char th = '원';
		String name = "이효원";
//		string s 대문자 ㅠ
		
		double left = 0.8;
		double right = 0.8;
		
		boolean male = true;
		boolean female = false;
		
		System.out.print("생년월일 : ");
		System.out.print(year);
		System.out.print(month);
		System.out.println(day);
				
		System.out.print("이름 : ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("이름 : ");
		System.out.println(name);
		
		System.out.print("시력(R) : ");
		System.out.println(right);
		System.out.print("시력(L) : ");
		System.out.println(left);
		
		System.out.print("성별 :");
		System.out.print(male);
		
		
		
		
		
		
		
		
		
		
	}

}
