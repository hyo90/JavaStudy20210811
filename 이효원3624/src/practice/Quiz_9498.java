package practice;
import java.util.Scanner;
public class Quiz_9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력 : ");
		String s = sc.nextLine();
				
		int a = Integer.parseInt(s);
		
		if (a > 90 && a < 100) {
			System.out.println("A");
		}
		else if (a > 80 && a < 89) {
			System.out.println("B");
		}
		else if (a > 70 && a < 79) {
			System.out.println("c");
		}
		else if (a > 60 && a < 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	}

}
