package a9_메소드;

import java.util.Scanner;

public class Quiz {
	
	public void quiz1(int starCount) {
		for(int i = 0; i < starCount; i++) { 		
			for(int j = 0; j < i + 1; j++) { 
		}
				System.out.print("*"); 		
			}
		System.out.println();
		
		
		
	}
//	public void 각 매서드들이 작성 됨 세개! 
//	main은 static이 붙어있꼬 다른애들은 안붙어잇음
	
	
	
	public void procStart(String selector, int starCount) {//매개변수
		if(selector.equals("1")) {
			quiz1(starCount);
		} else if (selector.equals("2")) {
			quiz2(starCount);
		} else if (selector.equals("3")) {
			quiz3(starCount);
		} else if (selector.equals("4")) { //1,2,3,4가 아니면 5니까 노상관
			quiz4(starCount);
		} else {
			quiz5(starCount);
		}
				
	}
	
	public void mainMenuPrint() {
		System.out.println("[별찍기 프로그램]");
		System.out.println("1. 문제 1");
		System.out.println("2. 문제 2");
		System.out.println("3. 문제 3");
		System.out.println("4. 문제 4");
		System.out.println("5. 문제 5");
		System.out.println("q.프로그램 종료"); // 이것들 main문에 있다가 void에 올림ㅋㅋ
	}
		

	public static void main(String[] args) {
		
		Quiz m= new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {	
		m.mainMenuPrint(); //m.메인메뉴 메서드를 호출함 그게 위에 public void mainMenu이거 !! // 항상 떠야하는꺼야하니까 
		System.out.print("명령을 입력하세요 : ");
		String selector = in.nextLine(); //nextline에 입력하면 버퍼에 저장안됨
		 
		
		if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") 
			|| selector.equals("5")) { //1-5까지 입력했을때 개수를 입력하라 창이 뜨게!! 
			
			System.out.print("출력할 별의 개수를 입력하세요 :  ");
			int starCount = in.nextInt(); //string인지 int인지 next다음 문자확깅ㄴ
			in.hasNextLine();
			
			m.procStart(selector,  starCount);
							
			
		}else if(selector.equals("q")) {
			System.out.println("프로그램 종료중...");
			loopFlag = false;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
//		함수 = 메서드
//		숙제
//		첫번째 입력:
		
		/*
		 * [별찍기 프로그램]
		 * 1. 문제 1
		 * 2. 문제 2
		 * 3. 문제 3
		 * 4. 문제 4
		 * 5. 문제 5
		 * q.프로그램 종료
		 * 명령을 입력하세요 : 1 
		 * 
		 * 명령 입력 후 별 개수 입력 떠야함
		 * 
		 * 출력할 별의 개수를 입력하세요 : 10
		 *    : **********
		 * 함수로 만드세여 
		 * 메소드를 이용해서 만들어야함
		 * 1이라는 값을 전달해서
		 * 출력할 별의 개수 넘길거다
		 * 매개변수 두개!! 
		 * 재료두개랍니다
		 * 
		 * 몇번쨰 문제를 명령할꺼고 
		 * void procStart(명령 번호, 10){
		 *  if(1번이면){
		 * 		void quiz1(별의 개수){
		 * 			for()
		 * 		}  
		 *  } else if (2번이면){
		 *  
		 *  }
		 * }
		 * 
		 * 메서드를 5개 만들어서 
		 * 이 메서드
		 * 
		 * 깃허브 꼭 올리세요 ㅠ ㅠ ㅠ 
		 * 그묘잉ㄹ까지
		 * 쪼금ㅁ나생각하면만들수잇서염
		 * 복습ㅈ한다새악가하고오오네넹
		 * 
		 * 
		 */
		
		
		
		
	}

}
