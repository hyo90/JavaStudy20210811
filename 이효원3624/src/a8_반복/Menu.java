package a8_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true;
//		클래스안에 main이라는 함숙 ㅏ드러가잇삳ㅇ 극그거슨함수(메소드)자바에서는메소드라고불리운다
					
//		while 무한반복~~~
		while(mainFlag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			String selecter = in.nextLine(); //문자열 입력!!!!
			
			
			if(selecter.equals("1")) { //문자는 equls 써야함 ==부등호안됨
				while(true) { //while안에 변수명지정해야 원하는대로 지정?이가능함........대학생과제수준.......^-^...^-^-^-^-_-^-^_^-^_^
					System.out.println("[김준일 강사 폴더]");
					System.out.println("1. javaStudy 폴더");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 입력하세요 : ");
					selecter = in.nextLine();
					
					if(selecter.equals("1")) {
						System.out.println("[javaStudy 폴더]");
					}else if(selecter.equals("b")) {
						break;
					}else if(selecter.contentEquals("q")) {
						System.out.println("프로그램 종료중....");//다른메뉴사용중이더라도 종료시킬수이써야함...
						mainFlag = false; //변수명
						break;//뒤에거러주세요
					}else {
						System.out.println("잘못된 입력입니다.");
					}
				}
				
				
			
			} else if(selecter.equals("q")) { //무한반복되기떔에 q입력해도 안되이임 그래서 멈춰조야함
				System.out.println("프로그램 종료 중 ...");
				break; //뒤어넣어주야함 앞에넣으면 q해당하는 문구 안뜸
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}	
		
		
		System.out.println("프로그램 종료!"); // while밖에!! while 끝나면 뜨도록
		
		
		
	}

}
