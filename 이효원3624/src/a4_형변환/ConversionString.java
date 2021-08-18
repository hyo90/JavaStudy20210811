package a4_형변환;

public class ConversionString {

	public static void main(String[] args) {
//		문자열(string)의 형변환 (제일 높음ㅋ.ㅋ)
		int num = 10;
		int num2 = 10;
		String sNum = "10";

//		int + int + sting 10 ㅋㅋ 2010
		System.out.println(num + num2 + sNum);
		System.out.println(sNum + (num + num2));
//		sNum (문자열) + int 숫자 먼저 연산됨 num2(int)가 더해101010 순서가 중요함~!~! 순서 or 괄호로 묶어주면 됨
//		키보드 입력받을때 다시 string 함
		
//		문자열 -> 다른 자료형(boolean(), int(정수), double(실수))
//		int(정수) : Integer.parseInt(문자열);
		int i = Integer.parseInt("10");
//		:int = 10인데 double (10.1)로 하면 오류가 남 -> double이 형이 더 커서 안됨 / 오류날때 빨간줄 안뜨는건(잘못된거중에) run time 때 오류가 뜸 !! 실행되었을때
//		오류(빨간줄)뜨는건 말되는데 수정해주라는거임 
		double d = Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
//		다른 자료형 -> 문자열
//		int(정수) : integer.toString(정수);
		Integer.toString(10);
		Double.toString(10.1);
		Boolean.toString(false);
		
	

	}

}
