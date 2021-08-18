package a7_조건;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner를 통한 표준 입력
		// grade 변수 문자열로 선언
		// 성적을 입력해주세요(A ~ F) : 문자열 입력
		// if(A등급 true) {학생의 성적은 90 ~ 100점 입 니다.}
		// else if (B등급  true) {학생의 성적은 80 ~ 89점 입니다.} 
		// .... 
		// ~ F까지
		// else{ A ~ F 까지만 입력할 수 있습니다.}
				
		Scanner input = new Scanner (System.in);
		System.out.print("성적을 입력해주세요(A ~ F) : ");
		
		String grade = input.nextLine();   
		if (grade.equals("A") || grade.equals("a")) {
			System.out.println("학생의 성적은 90 ~ 100점입니다.");}
		 else if (grade.equals("B") || grade.equals("b")) {
			System.out.println("학생의 성적은 80 ~ 89점 입니다.");}
		 else if (grade.equals("C") || grade.equals("c")) {
			System.out.println("학생의 성적은 70 ~ 79점 입니다.");}
		 else if (grade.equals("D") || grade.equals("d")) {
				System.out.println("학생의 성적은 60 ~ 69점 입니다.");}
		 else if (grade.equals("E") || grade.equals("e")) {
				System.out.println("학생의 성적은 50 ~ 59점 입니다.");}
		 else if (grade.equals("F") || grade.equals("f")) {
				System.out.println("학생의 성적은 40 ~ 49점 입니다.");}
		 else {System.out.println("A ~ F 까지만 입력할 수 있습니다");}
					
}}
		
		   
		   

