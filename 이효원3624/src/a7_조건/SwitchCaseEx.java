package a7_����;

public class SwitchCaseEx {

	public static void main(String[] args) {
		char select = 'd';
		
		switch(select) {
			case 'a': 
				System.out.println("a�Դϴ�.");
				break;
			case 'b': 
				System.out.println("b�Դϴ�.");
				break;
			case 'c': 
				System.out.println("c�Դϴ�.");
				break;
			default :
				System.out.println("a,b,c�� �ƴմϴ�.");
		}

		System.out.println("�׻� ��µ˴ϴ�.");
		
		int score = 88;
		
		switch(score / 10) {
//		score(88)/10= ����(int) = 8
			case 10 : System.out.println("100��"); break;
			case 9 : System.out.println("90����"); break;
			case 8 : System.out.println("80����"); break;
			case 7 : System.out.println("70����"); break;
			case 6 : System.out.println("60����"); break;
			case 5 : System.out.println("50����"); break;
			case 4 : System.out.println("40����"); break;
			case 3 : System.out.println("30����"); break;
			case 2 : System.out.println("20����"); break;
			case 1 : System.out.println("10����"); break;
			default : System.out.println("1����"); 
			
				
		}
	}

}
