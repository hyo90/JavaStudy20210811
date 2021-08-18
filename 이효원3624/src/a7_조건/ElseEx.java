package a7_조건;

public class ElseEx {

	public static void main(String[] args) {
		
		if('a' == 'A') {
			System.out.println("두 문자가 같습니다.");}
		   else { if('A' == 'A') 
		           {System.out.println("두 문자가 같습니다.");}
		   else {System.out.println("두 문자가 다릅니다.");}
		}

}}



// 'a'가 'A'랑 같으면(if) "두 문자가 같습니다."
// 아니면(else)... 혹쉬 'A'랑 'A'랑 같은거면 "두 문자가 같습니다"로
// 이것 또한 아니면 "두 문자가 다릅니다." 출력하세오!!! 