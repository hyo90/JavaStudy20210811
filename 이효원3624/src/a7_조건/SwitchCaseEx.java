package a7_조건;

public class SwitchCaseEx {

	public static void main(String[] args) {
		char select = 'd';
		
		switch(select) {
			case 'a': 
				System.out.println("a입니다.");
				break;
			case 'b': 
				System.out.println("b입니다.");
				break;
			case 'c': 
				System.out.println("c입니다.");
				break;
			default :
				System.out.println("a,b,c가 아닙니다.");
		}

		System.out.println("항상 출력됩니다.");
		
		int score = 88;
		
		switch(score / 10) {
//		score(88)/10= 정수(int) = 8
			case 10 : System.out.println("100점"); break;
			case 9 : System.out.println("90점대"); break;
			case 8 : System.out.println("80점대"); break;
			case 7 : System.out.println("70점대"); break;
			case 6 : System.out.println("60점대"); break;
			case 5 : System.out.println("50점대"); break;
			case 4 : System.out.println("40점대"); break;
			case 3 : System.out.println("30점대"); break;
			case 2 : System.out.println("20점대"); break;
			case 1 : System.out.println("10점대"); break;
			default : System.out.println("1점대"); 
			
				
		}
	}

}
